package controller.bai1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FirstServlet", value = "/FirstServlet")
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            String userName = request.getParameter("userName");
            out.print("Welcome " + userName);

            HttpSession session = request.getSession();
            session.setAttribute("uname", userName);

            out.print("<br><a href= 'SecondServlet'>Visit</a>");

            out.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
