package com.example.product2.controller;

import com.example.product2.model.Product;
import com.example.product2.service.CategoryService;
import com.example.product2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    CategoryService categoryService;

    @GetMapping("/list")
    public String showList(Model model,
                       @RequestParam("page") Optional<Integer> page,
                       @RequestParam("size") Optional<Integer> size) {
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(3);
        Page<Product> products = productService.findAll(PageRequest.of(currentPage - 1, pageSize));
        model.addAttribute("products", products);
        return "/view/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("categories", categoryService.findAll());
        return "/view/create";
    }

    @PostMapping("/create")
    public String doCreate(@Validated @ModelAttribute("product") Product product,
                           BindingResult bindingResult, Model model, RedirectAttributes rd) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("categories", categoryService.findAll());
            return "/view/create";
        }
        product.setCategory(categoryService.findById(product.getCategory().getCategoryId()));
        productService.create(product);
        rd.addFlashAttribute("message", "Create Successfully");
        return "redirect:/product/list";
    }

    @PostMapping("/deleteAll")
    public String doDeleteAll(@RequestParam("selectedProducts") List<Long> selectedProductIds, RedirectAttributes redirect) {
        productService.deleteAll(selectedProductIds);
        redirect.addFlashAttribute("message", "Removed successfully!");
        return "redirect:/product/list";
    }

    @GetMapping("/delete/{id}")
    public String doDelete(@PathVariable Long id) {
        productService.deleteById(id);
        return "redirect:/product/list";
    }

}
