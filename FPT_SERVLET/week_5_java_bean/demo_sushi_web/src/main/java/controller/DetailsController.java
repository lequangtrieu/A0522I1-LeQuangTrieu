package controller;

import entity.Article;
import model.ArticleModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DetailsController", value = "/DetailsController")
public class DetailsController extends HttpServlet {
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
        ArticleModel model;
        model = new ArticleModel();
        String id = request.getParameter("id"); // get id of post
        Article article = model.getDetailsPost(Integer.parseInt(id));
        request.setAttribute("content", article);
        request.setAttribute("urlCover", article);
        request.getRequestDispatcher("detailsPost.jsp").forward(request, response);
    }
}
