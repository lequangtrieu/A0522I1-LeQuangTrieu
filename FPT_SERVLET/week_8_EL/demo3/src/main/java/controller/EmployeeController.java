package controller;

import model.Address;
import model.Employee;
import model.Name;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "EmployeeController", value = "/EmployeeController")
public class EmployeeController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee("1", new Address("1", "Nam Ky Khoi Nghia", "Da Nang", "123"), new Name("1", "Jonh", "Smith")));
        list.add(new Employee("2", new Address("2", "Vo Chi Cong", "Ha Noi", "456"), new Name("2", "Linda", "Nguyen")));
        list.add(new Employee("3", new Address("3", "Le Van Hien", "Ho Chi Minh", "789"), new Name("3", "Mary", "Le")));

        request.setAttribute("list", list);
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
