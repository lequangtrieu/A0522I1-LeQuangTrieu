package com.example.product_management.controller;

import com.example.product_management.model.Product;
import com.example.product_management.service.CategoryService;
import com.example.product_management.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @Autowired
    CategoryService categoryService;
    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("products", productService.findAll());
        return "view/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("categories", categoryService.findAll());
        return "view/create";
    }

    @PostMapping("/create")
    public String doCreate(@Valid @ModelAttribute Product product, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("categories", categoryService.findAll());
            return "view/create";
        }
        product.setCategory(categoryService.findById(product.getCategory().getCategoryId()));
        productService.create(product);
        return "redirect:/product/list";
    }

    @GetMapping("/searchName")
    public String searchByName(@RequestParam("name") String name, Model model) {
        List<Product> productList = productService.searchByName(name);
        model.addAttribute("products", productList);
        model.addAttribute("name", name);
        return "view/list";
    }
}
