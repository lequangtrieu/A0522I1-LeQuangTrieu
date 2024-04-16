package com.example.demo.controller;

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.service.CategoryService;
import com.example.demo.service.ProductService;
import com.example.demo.validation.ProductValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    @Autowired
    ProductValidate validate;

    @GetMapping("/list2")
    public String showList(Model model) {
        model.addAttribute("products", productServicưe.findAll());
        return "/view/product/list2";
    }

    @GetMapping(value = "/list")
    public String list(Model model,
                       @RequestParam("page") Optional<Integer> page,
                       @RequestParam("size") Optional<Integer> size) {

        int currentPage = page.orElse(1);
        int pageSize = size.orElse(5);
        Slice<Product> products = productService.findAllWithSlice(PageRequest.of(currentPage - 1, pageSize));
        model.addAttribute("products", products.getContent());
        model.addAttribute("page", products);
        return "/view/product/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("categories", categoryService.findAll());
        return "/view/product/create";
    }

    @PostMapping("/create")
    public String doCreate(@Validated @ModelAttribute("product") Product product, RedirectAttributes rd,
                           BindingResult bindingResult, Model model) {
        validate.validate(product, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("categories", categoryService.findAll());
            return "/view/product/create";
        }
        product.setCategory(categoryService.findById(product.getCategory().getCategoryId()));
        productService.create(product);
        rd.addFlashAttribute("message", "Create Successfully");
        return "redirect:/product/list";
    }

    @GetMapping("/update")
    public String showUpdate(@RequestParam("id") int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        model.addAttribute("categories", categoryService.findAll());
        return "/view/product/update";
    }

    @PostMapping("/update")
    public String doUpdate(@ModelAttribute("product") Product product) {
        product.setCategory(categoryService.findById(product.getCategory().getCategoryId()));
        productService.update(product);
        return "redirect:/product/list";
    }

    @GetMapping("/delete/{id}")
    public String doDelete(@PathVariable int id, RedirectAttributes rd) {
        productService.deleteById(id);
        rd.addFlashAttribute("message", "Delete Successfully");
        return "redirect:/product/list";
    }

    @GetMapping("/searchName")
    public String search(@RequestParam("name") String name, Model model,
                         @RequestParam("page") Optional<Integer> page,
                         @RequestParam("size") Optional<Integer> size) {
        List<Product> productList = productService.findProductByName(name);
        model.addAttribute("products", productList);
        model.addAttribute("name", name);

//        int currentPage = page.orElse(1);
//        int pageSize = size.orElse(5);
//        Slice<Product> products = productService.findAllWithSlice(PageRequest.of(currentPage - 1, pageSize));
//        model.addAttribute("page", products);
        return "/view/product/search";
    }


//    @GetMapping("/category")
//    public String search(@RequestParam("category") String category, Model model) {
//        List<Product> productList = productService.findProductByCategoryName(category);
//        model.addAttribute("products", productList);
//        model.addAttribute("category", category);
//        return "/view/product/search";
//    }

    @GetMapping("/searchPrice")
    public String search(@RequestParam("beginPrice") Double beginPrice, Model model) {
        List<Product> productList = productService.findProductByPrice(beginPrice);
        model.addAttribute("products", productList);
        model.addAttribute("beginPrice", beginPrice);
        return "/view/product/search";
    }

    @ExceptionHandler(SQLException.class)
    public String handleError(SQLException e, Model model) {
        model.addAttribute("error", e.getMessage());
        return "view/errorPage";
    }
}
