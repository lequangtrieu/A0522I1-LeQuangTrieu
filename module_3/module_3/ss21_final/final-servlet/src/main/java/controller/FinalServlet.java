package controller;

import model.Product;
import repository.IProductRepository;
import repository.ProductRepository;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "FinalServlet", value = "/product")
public class FinalServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private IProductRepository productRepository;

    public void init() {
        productRepository = new ProductRepository();
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
            case "delete":
                try {
                    deleteProduct(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "search":
                search(request, response);
                break;
            case "searchFloor":
                searchFloor(request, response);
            default:
                listProduct(request, response);
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
                    insertProduct(request, response);
                    break;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void listProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> listProduct = productRepository.selectAllProduct();
        request.setAttribute("listProduct", listProduct);
        request.getRequestDispatcher("product/list.jsp").forward(request, response);
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("product/create.jsp").forward(request, response);
    }

    private void insertProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        String id = request.getParameter("id");
        String area = request.getParameter("area");
        String status = request.getParameter("status");
        String floor = request.getParameter("floor");
        String roomType = request.getParameter("roomType");
        String detail = request.getParameter("detail");
        String priceRent = request.getParameter("priceRent");
        String dateBegin = request.getParameter("dateBegin");
        String dateEnd = request.getParameter("dateEnd");

        Product product = new Product(id, area, status, floor, roomType, detail, priceRent, dateBegin, dateEnd);
        productRepository.insertProduct(product);

        request.getRequestDispatcher("product/create.jsp").forward(request, response);
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        String id = request.getParameter("id");
        productRepository.deleteProduct(id);
        response.sendRedirect("/product");
    }

    private void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sr = request.getParameter("search");
        List<Product> listProduct = productRepository.search(sr);
        request.setAttribute("listProduct", listProduct);
        request.getRequestDispatcher("product/list.jsp").forward(request, response);
    }

    private void searchFloor(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sr = request.getParameter("searchFloor");
        List<Product> listProduct = productRepository.searchFloor(sr);
        request.setAttribute("listProduct", listProduct);
        request.getRequestDispatcher("product/list.jsp").forward(request, response);
    }
}
