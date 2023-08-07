package com.example.finalexam2.controller;

import com.example.finalexam2.model.Product;
import com.example.finalexam2.service.CateService;
import com.example.finalexam2.service.ProService;
import com.example.finalexam2.service.ProServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProService proService;

    @Autowired
    private CateService cateService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("products", proService.findAll());
        return "/view/product/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("categories", cateService.findAll());
        return "/view/product/create";
    }

    @PostMapping("/create")
    public String doCreate(@ModelAttribute("product") Product product) {
        product.setCategory(cateService.findById(product.getCategory().getCategoryId()));
        proService.create(product);
        return "redirect:/product/list";
    }

    @GetMapping("/update")
    public String showUpdate(@RequestParam("id") int id, Model model) {
        model.addAttribute("product", proService.findById(id));
        model.addAttribute("categories", cateService.findAll());
        return "/view/product/update";
    }

    @PostMapping("/update")
    public String doUpdate(@ModelAttribute("product") Product product) {
        product.setCategory(cateService.findById(product.getCategory().getCategoryId()));
        proService.update(product);
        return "redirect:/product/list";
    }
}
