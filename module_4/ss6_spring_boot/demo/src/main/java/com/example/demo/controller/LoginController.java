package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletRequest;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@Controller
public class LoginController {
    @GetMapping("/login")
    public String showLoginPage() {
        return "view/login";
    }

    @PostMapping("/login")
    public String doLogin(@RequestParam("username") String username,
                          @RequestParam("password") String password,
                          Model model, HttpSession httpSession) {

        if("admin".equals(username) && "123456".equals(password)) {
            // login thành công
            httpSession.setAttribute("user", username);
//            httpSession.setMaxInactiveInterval(5);
            return "redirect:/product/list";
        }
        model.addAttribute("error", "Username hoặc password không đúng");
        return "view/login";
    }

    @PostMapping("/logout")
    public String doLogout(HttpSession httpSession) {
        httpSession.removeAttribute("JSESSIONID");
        return "redirect:/login";
    }
}
