package furama.com.vn.furama_resort.controller.Login_LogoutController;

import furama.com.vn.furama_resort.model.user.User;
import furama.com.vn.furama_resort.service.UserDTO.UserService;
import furama.com.vn.furama_resort.service.UserDTO.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    private final UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/view/login-logout/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            User user = userService.findUserByUsernameAndPassword(username, password);

            if (user != null) {
                // Tạo và đặt giá trị vào cookies
                Cookie usernameCookie = new Cookie("username", username);
                Cookie passwordCookie = new Cookie("password", password);

                // Đặt thời gian tồn tại của cookies (ví dụ: 30 ngày)
                usernameCookie.setMaxAge(30 * 24 * 60 * 60); // Số giây
                passwordCookie.setMaxAge(30 * 24 * 60 * 60); // Số giây
                // ??
                response.addCookie(usernameCookie);
                response.addCookie(passwordCookie);
                // ??
                request.getSession().setAttribute("username", user.getUserName());
                request.getSession().setAttribute("userRole", user.getRole());

                if (user.getRole().equals("admin")) {
                    response.sendRedirect("/admin");
                    return;
                }

                if (user.getRole().equals("user")) {
                    response.sendRedirect("/user");
                    return;
                }
            }

            request.setAttribute("message", "Username or password is incorrect");
            request.getRequestDispatcher("/view/login-logout/login.jsp").forward(request, response);

        } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }

    }
}
