package furama.com.vn.furama_resort.controller.AdminController;

import furama.com.vn.furama_resort.model.service.RentType;
import furama.com.vn.furama_resort.model.service.Service;
import furama.com.vn.furama_resort.model.service.ServiceType;
import furama.com.vn.furama_resort.service.ServiceDTO.ServiceDTOService;
import furama.com.vn.furama_resort.service.ServiceDTO.ServiceDTOServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServiceServlet", value = "/service")
public class ServiceServlet extends HttpServlet {
    private final ServiceDTOService serviceDTOService = new ServiceDTOServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        try {
            List<ServiceType> serviceTypeList = serviceDTOService.getAllServiceType();
            List<RentType> rentTypeList = serviceDTOService.getAllRentType();
            switch (action) {
                case "showCreateService":
                    request.setAttribute("serviceTypeList", serviceTypeList);
                    request.setAttribute("rentTypeList", rentTypeList);
                    request.getRequestDispatcher("/view/admin/service/createService.jsp").forward(request, response);
                    break;
                case "showUpdateService":
                    request.setAttribute("serviceTypeList", serviceTypeList);
                    request.setAttribute("rentTypeList", rentTypeList);
                    int id = Integer.parseInt(request.getParameter("id"));
                    Service service = serviceDTOService.getServiceById(id);
                    request.setAttribute("service", service);
                    request.getRequestDispatcher("/view/admin/service/createService.jsp").forward(request, response);
                    break;
                case "listGroup":
//                    showListGroupContact(request, response);
                    break;
                case "delete":
//                    deleteContact(request, response);
                    break;
                case "listService":
                    List<Service> serviceList = serviceDTOService.getAllService(10);
                    request.setAttribute("serviceList", serviceList);
                    request.getRequestDispatcher("/view/admin/service/serviceList.jsp").forward(request, response);
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
                case "createService":
                    String serviceName = request.getParameter("service_name");
                    String serviceImg = request.getParameter("service_img");
                    int serviceArea = Integer.parseInt(request.getParameter("service_area"));
                    double serviceCost  = Double.parseDouble(request.getParameter("service_cost"));
                    int serviceMaxPeople = Integer.parseInt(request.getParameter("service_max_people"));
                    String standardRoom = request.getParameter("standard_room");
                    String otherConvenience = request.getParameter("description_other_convenience");
                    double poolArea  = Double.parseDouble(request.getParameter("pool_area"));
                    int numberOfFloors = Integer.parseInt(request.getParameter("number_of_floors"));
                    int serviceTypeID = Integer.parseInt(request.getParameter("serviceTypeID"));
                    int rentTypeID = Integer.parseInt(request.getParameter("rentTypeID"));

                    Service service = new Service(serviceName, serviceImg, serviceArea, serviceCost, serviceMaxPeople, standardRoom, otherConvenience, poolArea, numberOfFloors, serviceTypeID, rentTypeID);
                    serviceDTOService.createService(service);
                    response.sendRedirect("/service?action=listService");
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
            }
        } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }

    }
}
