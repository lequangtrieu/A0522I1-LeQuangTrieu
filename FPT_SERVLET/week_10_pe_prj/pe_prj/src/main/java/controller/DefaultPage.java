package controller;

import model.GroupContact;
import service.ContactService;
import service.ContactServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AddContactController", value = "/", loadOnStartup = 1)
public class DefaultPage extends HttpServlet {
    private final ContactService contactService = new ContactServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<GroupContact> groupContactList = contactService.selectAllGroupContact();
//        for (int i = 0; i < groupContactList.size(); i++) {
//            System.out.println(groupContactList.get(i).getId());
//        }
        request.setAttribute("groupList", groupContactList);
        request.getRequestDispatcher("contact/addContact.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
