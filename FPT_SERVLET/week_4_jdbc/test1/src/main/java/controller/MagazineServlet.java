package controller;

import model.Magazine;
import model.MagazinesDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "MagazineServlet", value = "/magazine")
public class MagazineServlet extends HttpServlet {
    private final MagazinesDAO magazinesDAO = new MagazinesDAO();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        } else {
            request.getRequestDispatcher("error404.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String title = request.getParameter("title");
        String publisher = request.getParameter("publisher");
        String price = request.getParameter("price");
        Magazine magazine = new Magazine(id, title, publisher, price);
        try {
            magazinesDAO.newMagazine(magazine);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

}
