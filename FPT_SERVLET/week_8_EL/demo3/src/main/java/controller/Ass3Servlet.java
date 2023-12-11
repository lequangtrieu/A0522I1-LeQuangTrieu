package controller;

import model.Name;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Ass3Servlet", value = "/Ass3Servlet")
public class Ass3Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Name> list = new ArrayList<>();

        list.add(new Name("1", "Jonh", "Smith"));
        list.add(new Name("2", "Linda", "Nguyen"));
        request.setAttribute("list", list);
        request.getRequestDispatcher("ass3.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
