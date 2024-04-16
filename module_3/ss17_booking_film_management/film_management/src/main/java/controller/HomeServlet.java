package controller;

import DAO.FilmDao;
import model.Film;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomeServlet", value = "/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        FilmDao db = new FilmDao();
//        List<Film> film = db.getNewFilmTop6();// lấy top 6
//
//        request.setAttribute("film", film);

        request.getRequestDispatcher("view/user/home.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
