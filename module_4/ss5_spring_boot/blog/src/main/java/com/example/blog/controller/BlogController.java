package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.BlogService;
import com.example.blog.service.CateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("blog")
public class BlogController {
    @Autowired
    BlogService blogService;

    @Autowired
    CateService cateService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("blogs", blogService.findAll());
        return "blog/list";
    }

    public String showCreate(Model model) {
        model.addAttribute("blogs", new Blog());
        model.addAttribute("categories", cateService.findAll());
        return "blog/create";
    }

    public String doCreate(@ModelAttribute("blog") Blog blog, Model model) {
        blog.setCategory(cateService.findById(blog.getCategory().getCategoryId()));
        blogService.create(blog);
        return "blog/list";
    }

}
