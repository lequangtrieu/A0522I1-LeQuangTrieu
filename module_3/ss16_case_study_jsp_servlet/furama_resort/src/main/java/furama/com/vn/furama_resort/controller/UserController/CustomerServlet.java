package furama.com.vn.furama_resort.controller.UserController;

import furama.com.vn.furama_resort.model.customer.Customer;
import furama.com.vn.furama_resort.service.CustomerDTO.CustomerService;
import furama.com.vn.furama_resort.service.CustomerDTO.CustomerServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {
    private final CustomerService customerService = new CustomerServiceImpl();
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
                case "listCustomer":
                    List<Customer> customerList = customerService.listAllCustomer(10);
                    request.setAttribute("customerList", customerList);
                    request.getRequestDispatcher("/view/customer/customerList.jsp").forward(request, response);
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
