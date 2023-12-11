package controller;

import model.HourlyEmployee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "EmployeeServlet", value = "/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int employeeID = Integer.parseInt(request.getParameter("employeeID"));
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        double hourlyRate = Double.parseDouble(request.getParameter("hourlyRate"));

        // create the employee object
        HourlyEmployee employee = new HourlyEmployee(employeeID, firstName, lastName, hourlyRate);

        // create a Map of tax rate
        Map<String, String> taxRates = new HashMap<String, String>();
        taxRates.put("Mr A", "6.00");
        taxRates.put("Mr B", "9.00");
        taxRates.put("Mr C", "12.00");
        taxRates.put("Mr E", "12.00");
        taxRates.put("Mr F", "12.00");

        //set session attributes
        HttpSession session = request.getSession();
        session.setAttribute("EMPLOYEE", employee);
        session.setAttribute("TAXRATES", taxRates);

        RequestDispatcher dispatcher = request.getRequestDispatcher("el-employee-demo/show-info.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
