package controller;

import model.Student;
import service.StudentService;
import service.StudentServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "StudentServlet", value = "/student")
public class StudentServlet extends HttpServlet {
    private final StudentService studentService = new StudentServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                request.getRequestDispatcher("student/createUpdate.jsp").forward(request, response);
                break;
            case "update":
                int id = Integer.parseInt(request.getParameter("id"));
                Student student = studentService.getStudentById(id);
                request.setAttribute("student", student);
                request.getRequestDispatcher("student/createUpdate.jsp").forward(request, response);
                break;
            case "delete":
                int idDelete = Integer.parseInt(request.getParameter("id"));
                studentService.deleteById(idDelete);
                response.sendRedirect("/student");
                break;
            default:
                showList(request, response);
                break;
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                doCreate(request, response);
                break;
            case "update":
                doUpdate(request, response);
                break;
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> list = studentService.getAllList();
        request.setAttribute("listStudent", list);
        request.getRequestDispatcher("student/list.jsp").forward(request, response);
    }

    private void doCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String dob = request.getParameter("dob");
        Student student = new Student(id, name, gender, dob);
        studentService.add(student);
        response.sendRedirect("/student");
    }

    private void doUpdate(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String dob = request.getParameter("dob");
        Student student = new Student(id, name, gender, dob);

        studentService.update(student);
        response.sendRedirect("/student");
    }

}
