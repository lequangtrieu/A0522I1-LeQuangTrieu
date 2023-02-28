import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscount", value = "/discount")
public class ProductDiscount extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product = request.getParameter("product");
        double price = Double.parseDouble(request.getParameter("price"));
        int discount = Integer.parseInt(request.getParameter("percent"));
        double amount = price - (price * discount * 0.01);

        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.println("<h1 style=\"text-align: center\">"+ product +"</h1>");
        pw.println("<h2>Percent of discount: " + discount + "</h2>");
        pw.println("<h2>Amount is: " + amount + "</h2>");
    }
}
