/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;



import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.checkout.Session;
import com.stripe.param.checkout.SessionCreateParams;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author Thanh
 */
public class StripeServlet extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet StripeServlet</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet StripeServlet at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            Stripe.apiKey = "sk_test_51O4eC0Hk5D37ae7H2iGsQcjXLjW6bdyTipG1D9A9ygkhPNZTJxGkpaXbibvCYuvJF2BUgO5zOMqy2dZWsecWzJGH00USbETnx6";
            String title = request.getParameter("title");
            String slotTime = request.getParameter("slotTime");
            String filmTime = request.getParameter("filmTime");
            String ticket = title + " - " + slotTime + " - " +filmTime;
            
            String arrSeat = request.getParameter("arrSeat");// lấy tString seat từ form và tách ra từng cái seat cho vào array
        int id = (int) request.getSession().getAttribute("id");
        int showId = Integer.parseInt(request.getParameter("showId"));
            
            HttpSession session2 = request.getSession();
            session2.setAttribute("arrSeat", arrSeat);
            session2.setAttribute("id", id);
            session2.setAttribute("showId", showId);

            
            SessionCreateParams params =
                    SessionCreateParams.builder()
                            .setMode(SessionCreateParams.Mode.PAYMENT)
                            .setSuccessUrl("http://localhost:8080/BookingFilm/success") // Thay đổi thành cổng mà bạn đang sử dụng cho ứng dụng Servlet
                            .setCancelUrl("http://localhost:8080/BookingFilm/cancel") // Thay đổi thành cổng mà bạn đang sử dụng cho ứng dụng Servlet
                            .addLineItem(
                                    SessionCreateParams.LineItem.builder()
                                            .setQuantity(1L)
                                            .setPriceData(
                                                    SessionCreateParams.LineItem.PriceData.builder()
                                                            .setCurrency("usd")
                                                            .setUnitAmount(100L)
                                                            .setProductData(
                                                                    SessionCreateParams.LineItem.PriceData.ProductData.builder()
                                                                            .setName(ticket)
                                                                            
                                                                            .build())
                                                            .build())
                                            .build())
                            .build();
            
            Session session = Session.create(params);
            
            response.sendRedirect(session.getUrl());
        } catch (StripeException ex) {
            System.out.println(ex);
        }
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
