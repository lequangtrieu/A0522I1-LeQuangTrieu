package controller;

import model.Contact;
import model.GroupContact;
import service.ContactService;
import service.ContactServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ContactController", value = "/ContactController")
public class ContactController extends HttpServlet {
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
                    showUpdate(request, response);
                    break;
                case "listGroup":
                    showListGroupContact(request, response);
                    break;
                case "delete":
                    deleteContact(request, response);
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
                    addContact(request, response);
                    break;
                case "updateContact":
                    updateContact(request, response);
                    break;
                case "addGroupList":
                    addGroupList(request, response);
                    break;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        List<Contact> list = contactService.selectAllContact();
        int sizeContact = contactService.countSizeContact();
        request.setAttribute("sizeContact", sizeContact);
        request.setAttribute("listContact", list);
        request.getRequestDispatcher("contact/list.jsp").forward(request, response);
    }

    private void showListGroupContact(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<GroupContact> groupList = contactService.selectAllGroupContact();
        request.setAttribute("groupList", groupList);
        request.getRequestDispatcher("contact/listGroup.jsp").forward(request, response);
    }

    private void addContact(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String phoneNumber = request.getParameter("phoneNumber");
        int groupId = Integer.parseInt(request.getParameter("groupId"));

        Contact contact = new Contact(firstName, lastName, phoneNumber, groupId);
        contactService.addContact(contact);
        response.sendRedirect("/ContactController");
    }

    private void addGroupList(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        String name = request.getParameter("name");
        String description = request.getParameter("description");

        GroupContact groupContact = new GroupContact(name, description);
        contactService.addGroupList(groupContact);
        response.sendRedirect("/ContactController?action=listGroup");
    }

    private void deleteContact(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        contactService.deleteContactById(id);
        response.sendRedirect("/ContactController");
    }

    private void showUpdate(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        Contact contact = contactService.findContactById(id);
        List<GroupContact> groupList = contactService.selectAllGroupContact();
        request.setAttribute("groupList", groupList);
        request.setAttribute("contact", contact);
        request.getRequestDispatcher("contact/editContact.jsp").forward(request, response);
    }

    private void updateContact(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String phoneNumber = request.getParameter("phoneNumber");
        int groupId = Integer.parseInt(request.getParameter("groupId"));

        Contact contact = new Contact(id, firstName, lastName, phoneNumber, groupId);
        contactService.updateContact(contact);
        response.sendRedirect("/ContactController");
    }

}
