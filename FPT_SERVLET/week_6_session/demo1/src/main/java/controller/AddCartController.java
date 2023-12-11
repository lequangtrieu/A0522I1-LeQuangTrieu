package controller;

import model.Book;
import service.BookService;
import model.CartDTO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddCartController", value = "/AddCartController")
public class AddCartController extends HttpServlet {
    private final BookService bookService = new BookService();
    private final CartDTO cartDTO = new CartDTO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
//        CartDTO cartDTO = (CartDTO) session.getAttribute("cardDTO");

//        if (cartDTO == null) {
//            cartDTO = new CartDTO();
//        }

        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println(id);
        Book book = bookService.findById(String.valueOf(id).trim());
        System.out.println(book);

        cartDTO.addToCart(book);

        session.setAttribute("cardDTO", cartDTO);

        request.getRequestDispatcher("viewCard.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
