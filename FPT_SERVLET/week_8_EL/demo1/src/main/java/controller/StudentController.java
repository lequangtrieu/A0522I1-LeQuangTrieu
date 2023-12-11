package controller;

import model.Marks;
import model.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "StudentController", value = "/StudentController")
public class StudentController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, Marks> marks = new HashMap<>();
        marks.put("1", new Marks("1", 8.5, 6.2));
        marks.put("2", new Marks("2", 6.4, 9.5));

        List <Student> students = new ArrayList<>();
        students.add(new Student("1", "Trieu", marks.get("1")));
        students.add(new Student("2", "Hung", marks.get("2")));
        request.setAttribute("students", students);
        request.getRequestDispatcher("/demo5/demo5.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
