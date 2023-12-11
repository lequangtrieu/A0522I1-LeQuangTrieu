package controller.test;

import model.Book;
import service.CartBean;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TestServlet", value = "/TestServlet")
public class TestServlet extends HttpServlet {
    private final String homePage = "index.jsp";
    private final String showPage = "show.jsp";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        try {
            if (action.equals("AddMore")) {
                RequestDispatcher rd = request.getRequestDispatcher(homePage);
                rd.forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action.equals("Add to Cart")) {
            HttpSession session = request.getSession();
            CartBean shop = (CartBean) session.getAttribute("SHOP");


            if (shop == null) {
                shop = new CartBean();
            }


            String title = request.getParameter("cboBook");
            String id = "id";
            Book book = new Book(id, title);


            shop.addBook(book);

            session.setAttribute("SHOP", shop);

            RequestDispatcher rd = request.getRequestDispatcher(homePage);

            rd.forward(request, response);
        }

        String url = "CartController?action=View Cart";

        RequestDispatcher rd = request.getRequestDispatcher(url);

        rd.forward(request, response);
    }
}
