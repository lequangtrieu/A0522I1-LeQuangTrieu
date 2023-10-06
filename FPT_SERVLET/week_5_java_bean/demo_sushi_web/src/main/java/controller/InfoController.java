package controller;

import entity.Article;
import entity.Information;
import model.ArticleModel;
import model.InfoModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "InfoController", value = "/InfoController")
public class InfoController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception e) {
            response.sendRedirect("error.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        InfoModel model = new InfoModel();
        List<Information> info = model.getInfoPage();
        request.setAttribute("address", model.getAddress(info));
        request.setAttribute("tel", model.getTel(info));
        request.setAttribute("mail", model.getMail(info));
        request.setAttribute("openHours", model.getOpenHours(info));
        request.setAttribute("map", model.getUrlCover(info));
        request.setAttribute("FindUsColor", "setColor");
        request.getRequestDispatcher("findus.jsp").forward(request, response);
    }
}
