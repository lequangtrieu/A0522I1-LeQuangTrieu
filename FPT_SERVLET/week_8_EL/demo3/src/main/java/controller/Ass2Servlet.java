package controller;

import model.Name;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Ass2Servlet", value = "/Ass2Servlet")
public class Ass2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Name[] arr = {new Name("1", "Jonh", "Smith"), new Name("2", "Mary", "Nguyen")};

        request.setAttribute("arr", arr);
        request.getRequestDispatcher("ass2.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
