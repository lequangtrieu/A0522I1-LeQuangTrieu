package controller;

import entity.Information;
import model.ArticleModel;
import model.InfoModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomeController", value = "/HomeController")
public class HomeController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            doSth(request, response);
        } catch (Exception e) {
            response.sendRedirect("error.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            doSth(request, response);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    private void doSth(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ArticleModel model = new ArticleModel();
        InfoModel infoModel = new InfoModel();
        List<Information> info = infoModel.getInfoPage();
        int page = 1, pageSize = 2;
        int totalPage = model.getTotalRows(); // get number of content in DB
        if (request.getParameter("page") != null) { // check param page
            page = Integer.parseInt(request.getParameter("page")); // get param page
        }

        if (totalPage % pageSize == 0) { // calculator total page to showinformation
                    totalPage = totalPage / pageSize;
        } else {
            totalPage = totalPage / pageSize + 1;
        }

        if (page > totalPage) {
            request.setAttribute("noContent", "No article here!");
        } else {
            request.setAttribute("content", model.getArticlesFromTo(page,
                    pageSize));

        }
        request.setAttribute("page", page);
        request.setAttribute("totalPage", totalPage);
        request.setAttribute("urlCover", infoModel.getUrlCover(info));
        request.setAttribute("active", "HomeColor");
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
