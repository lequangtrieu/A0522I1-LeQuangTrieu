package furama.com.vn.furama_resort.controller.AdminController;

import furama.com.vn.furama_resort.model.employee.Employee;
import furama.com.vn.furama_resort.model.service.Service;
import furama.com.vn.furama_resort.service.EmployeeDTO.EmployeeService;
import furama.com.vn.furama_resort.service.EmployeeDTO.EmployeeServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", value = "/employee")
public class EmployeeServlet extends HttpServlet {
    private final EmployeeService employeeService = new EmployeeServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        try {
            switch (action) {
                case "createGroupList":
                    request.getRequestDispatcher("contact/addGroupList.jsp").forward(request, response);
                    break;
                case "update":
//                    showUpdate(request, response);
                    break;
                case "listGroup":
//                    showListGroupContact(request, response);
                    break;
                case "delete":
//                    deleteContact(request, response);
                    break;
                case "listEmployee":
                    List<Employee> employeeList = employeeService.getAllEmployee(10);
                    request.setAttribute("employeeList", employeeList);
                    request.getRequestDispatcher("view/admin/employee/employeeList.jsp").forward(request, response);
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

    }
}
