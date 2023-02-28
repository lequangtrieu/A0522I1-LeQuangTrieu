package controller;

import model.Motel;
import model.PaymentType;
import repository.IMotelRepository;
import repository.MotelRepository;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "MotelServlet", value = "/motel")
public class MotelServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private IMotelRepository motelRepository;

    public void init() {
        motelRepository = new MotelRepository();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateForm(request, response);
                break;
            case "update":
                showUpdateForm(request, response);
                break;
            case "delete":
                try {
                    deleteMotel(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "search":
                    search(request, response);
                break;
            case "sort":
//                    sortUserByName(request, response);
            default:
                listMotel(request, response);
                break;
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
                    insertMotel(request, response);
                    break;
                case "update":
                    updateMotel(request, response);
                    break;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void listMotel(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Motel> list = motelRepository.selectAllMotel();
        request.setAttribute("listMotel", list);
        request.getRequestDispatcher("motel/list.jsp").forward(request, response);
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<PaymentType> paymentList = motelRepository.selectAllPaymentType();
        request.setAttribute("paymentList", paymentList);
        request.getRequestDispatcher("motel/create.jsp").forward(request, response);
    }

    private void insertMotel(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        String name = request.getParameter("name");
        String phoneNumber = request.getParameter("phoneNumber");
        String dateBegin = request.getParameter("dateBegin");
        String note = request.getParameter("note");
        int idPayment = Integer.parseInt(request.getParameter("idPayment"));

        Motel motel = new Motel(name, phoneNumber, dateBegin, note, idPayment);
        motelRepository.insertMotel(motel);
        request.getRequestDispatcher("motel/create.jsp").forward(request, response);
    }

    private void showUpdateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Motel motel = motelRepository.selectMotel(id);
        List<PaymentType> paymentList = motelRepository.selectAllPaymentType();
        request.setAttribute("paymentList", paymentList);
        request.setAttribute("motel", motel);
        request.getRequestDispatcher("motel/edit.jsp").forward(request, response);
    }

    private void updateMotel(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String phoneNumber = request.getParameter("phoneNumber");
        String dateBegin = request.getParameter("dateBegin");
        String note = request.getParameter("note");
        int idPayment = Integer.parseInt(request.getParameter("idPayment"));

        Motel motel = new Motel(id, name, phoneNumber, dateBegin, note, idPayment);
        motelRepository.update(motel);
        response.sendRedirect("/motel");
    }

    private void deleteMotel(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        motelRepository.deleteMotel(id);
        response.sendRedirect("/motel");
    }

    private void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sr = request.getParameter("search");
        List<Motel> listMotel = motelRepository.search(sr);
        request.setAttribute("listMotel", listMotel);
        request.getRequestDispatcher("/motel/list.jsp").forward(request, response);
    }

}
