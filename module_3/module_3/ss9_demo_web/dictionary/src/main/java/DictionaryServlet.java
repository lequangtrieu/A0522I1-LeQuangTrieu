import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "DictionaryServlet", value = "/translate")
public class DictionaryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chao");
        dictionary.put("how", "The nao");
        dictionary.put("book", "sach");
        dictionary.put("computer", "may tinh");

        String word = request.getParameter("word");

        PrintWriter pw = response.getWriter();
        pw.println("<html>");

        String result = dictionary.get(word);
        if (result != null) {
            pw.println("Word: "+ word);
            pw.println("<br> Result: "+ result);
        } else {
            pw.println("Not found");
        }
    }
}
