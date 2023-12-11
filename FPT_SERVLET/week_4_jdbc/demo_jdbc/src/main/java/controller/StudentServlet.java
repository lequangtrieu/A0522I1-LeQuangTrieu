package controller;

import model.Student;
import service.StudentService;
import service.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

        try {
            switch (action) {
                case "create":
                    request.getRequestDispatcher("student/createUpdate.jsp").forward(request, response);
                    break;
                case "update":
                    showUpdate(request, response);
                    break;
                case "delete":
                    int idDelete = Integer.parseInt(request.getParameter("id"));
                    studentService.deleteById(idDelete);
                    response.sendRedirect("/student");
                    break;
                case "searchByName":
                    searchByName(request, response);
                    break;
                case "searchAllField":
                    searchAllField(request, response);
                    break;
                default:
                    showList(request, response);
                    break;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        try {
            switch (action) {
                case "create":
                    doCreate(request, response);
                    break;
                case "update":
                    doUpdate(request, response);
                    break;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> list = studentService.getAllList();
        request.setAttribute("listStudent", list);
        request.getRequestDispatcher("student/list.jsp").forward(request, response);
    }

    private void doCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
//        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String dob = request.getParameter("dob");
        Student student = new Student(name, gender, dob);
        studentService.add(student);
        response.sendRedirect("/student");
    }

    private void showUpdate(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Student student = studentService.getStudentById(id);
        request.setAttribute("student", student);
        request.getRequestDispatcher("student/createUpdate.jsp").forward(request, response);
    }

    private void doUpdate(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String dob = request.getParameter("dob");
        Student student = new Student(id, name, gender, dob);

        studentService.update(student);
        response.sendRedirect("/student");
    }

    private void searchByName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        String nameSearch = request.getParameter("nameSearch1");
        List<Student> listStudent = studentService.searchByName(nameSearch);
        request.setAttribute("listStudent", listStudent);
        request.getRequestDispatcher("/student/list.jsp").forward(request, response);
    }

    private void searchAllField(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        String nameSearch = request.getParameter("nameSearch");
        String genderSearch = request.getParameter("genderSearch");
        int minId = Integer.parseInt(request.getParameter("minId"));
        int maxId = Integer.parseInt(request.getParameter("maxId"));

        List<Student> listStudent = studentService.searchAllField(nameSearch, genderSearch, minId, maxId);
        request.setAttribute("listStudent", listStudent);
        request.getRequestDispatcher("/student/list.jsp").forward(request, response);
    }

}
