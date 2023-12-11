package furama.com.vn.furama_resort.controller.UserController;

import furama.com.vn.furama_resort.model.contact.Contact;
import furama.com.vn.furama_resort.model.employee.Employee;
import furama.com.vn.furama_resort.service.ContactDTO.ContactService;
import furama.com.vn.furama_resort.service.ContactDTO.ContactServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ContactServlet", value = "/contact")
public class ContactServlet extends HttpServlet {
    private final ContactService contactService = new ContactServiceImpl();

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
                case "listContact":
                    List<Contact> contactList = contactService.getAllContact(10);
                    request.setAttribute("contactList", contactList);
                    request.getRequestDispatcher("view/contact/contactList.jsp").forward(request, response);
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
