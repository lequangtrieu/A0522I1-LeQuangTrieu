package com.example.demo2.controller;

import com.example.demo2.model.Product;
import com.example.demo2.service.CateService;
import com.example.demo2.service.ProductService;
import com.example.demo2.validation.ProductValidate;
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
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CateService cateService;

    @Autowired
    private ProductValidate validate;

    @GetMapping("list")
    public String list(Model model,
                       @RequestParam("page") Optional<Integer> page,
                       @RequestParam("size") Optional<Integer> size) {
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(3);
        Sort sort = Sort.by("id").ascending();
        Page<Product> products = productService.getPageProduct(PageRequest.of(currentPage - 1, pageSize, sort));
        model.addAttribute("products", products);
        return "/view/product/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("categories", cateService.findAll());
        return "/view/product/create";
    }

    @PostMapping("/create")
    public String doCreate(@Validated @ModelAttribute("product") Product product,
                           BindingResult bindingResult, Model model, RedirectAttributes rd) {

        validate.validate(product, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("categories", cateService.findAll());
            return "/view/product/create";
        }

        product.setCategory(cateService.findById(product.getCategory().getCategoryId()));
        productService.create(product);
        rd.addFlashAttribute("message", "Create Successfully");
        return "redirect:/product/list";
    }

    @PostMapping("/delete")
    public String doDeleteAll(@RequestParam("selectedProducts") List<Integer> selectedProductIds, RedirectAttributes redirect) {
        productService.delete(selectedProductIds);
        redirect.addFlashAttribute("message", "Removed successfully!");
        return "redirect:/product/list";
    }

    @GetMapping("/searchName")
    public String search(@RequestParam("name") String name, Model model,
                         @RequestParam("page") Optional<Integer> page,
                         @RequestParam("size") Optional<Integer> size) {
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(3);
        Sort sort = Sort.by("name").ascending();
        model.addAttribute("name", name);
        Page<Product> productList = productService.searchByName(name,PageRequest.of(currentPage - 1, pageSize, sort));
        model.addAttribute("products", productList);
        return "/view/product/list";
    }

    @GetMapping("/searchCate")
    public String search(@RequestParam("category") int cateId, Model model) {
        List<Product> productList = productService.findProductByCateId(cateId);
        model.addAttribute("products", productList);
//        model.addAttribute("name", name);
        return "/view/product/list";
    }
}
