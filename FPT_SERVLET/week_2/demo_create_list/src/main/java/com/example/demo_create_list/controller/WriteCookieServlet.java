package com.example.demo_create_list.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "WriteCookieServlet", value = "/WriteCookieServlet")
public class WriteCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("username", "trieuLQ");
        cookie.setMaxAge(60 * 60 * 24);
        cookie.setPath("/");

        response.addCookie(cookie);
        response.getWriter().append("Cookie written!!").append(request.getContextPath());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
