package furama.com.vn.furama_resort.controller.UserController;

import furama.com.vn.furama_resort.model.service.Service;
import furama.com.vn.furama_resort.service.ServiceDTO.ServiceDTOService;
import furama.com.vn.furama_resort.service.ServiceDTO.ServiceDTOServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ViewRoomServlet", value = "/viewRoom")
public class ViewRoomServlet extends HttpServlet {
    private final ServiceDTOService serviceDTOService = new ServiceDTOServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Service> serviceList = serviceDTOService.getAllService(10);
            request.setAttribute("serviceList", serviceList);
            request.getRequestDispatcher("/view/user/rooms/bookRoom.jsp").forward(request, response);
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
