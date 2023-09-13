package com.example.fix_demo.controller;

import com.example.fix_demo.model.Student;
import com.example.fix_demo.model.StudentList;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletDemo", value = "/ServletDemo")
public class ServletDemo extends HttpServlet {
    private final StudentList sList = new StudentList();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String dob = request.getParameter("dob");
        Student stu1 = new Student(id, name, gender, dob);

        sList.add(stu1);
//                request.getSession().setAttribute("sList", sList);
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }
}
