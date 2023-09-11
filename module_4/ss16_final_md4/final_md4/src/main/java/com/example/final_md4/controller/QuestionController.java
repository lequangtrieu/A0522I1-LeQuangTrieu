package com.example.final_md4.controller;

import com.example.final_md4.model.Question;
import com.example.final_md4.repository.QuestionRepository;
import com.example.final_md4.service.CategoryService;
import com.example.final_md4.service.QuestionService;
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

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Optional;

@Controller
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;
    @Autowired
    CategoryService categoryService;

    @GetMapping("/list")
    public String showList(Model model,
                           @RequestParam("page") Optional<Integer> page,
                           @RequestParam("size") Optional<Integer> size) {
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(5);
        Sort.Order sort1 = new Sort.Order(Sort.Direction.DESC, "status");
        Sort.Order sort2 = new Sort.Order(Sort.Direction.ASC, "dateCreate");
        Sort sort = Sort.by(sort1, sort2);
//        Sort sort = Sort.by("status").descending();
        Page<Question> questions = questionService.findAll(PageRequest.of(currentPage - 1, pageSize, sort));
        model.addAttribute("questions", questions);
        return "/view/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("question", new Question());
        model.addAttribute("categories", categoryService.findAll());
        return "/view/create";
    }

    @PostMapping("/create")
    public String doCreate(@Validated @ModelAttribute("question") Question question,
                           BindingResult bindingResult, Model model, RedirectAttributes rd) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("categories", categoryService.findAll());
            return "/view/create";
        }
        question.setCategory(categoryService.findById(question.getCategory().getCategoryId()));
        question.setStatus("wait");
        question.setDateCreate(LocalDate.now());
        questionService.create(question);
        rd.addFlashAttribute("message", "Create Successfully");
        return "redirect:/question/list";
    }

    @GetMapping("/update")
    public String showUpdate(@RequestParam("id") Long id, Model model) {
        model.addAttribute("question", questionService.findById(id));
        model.addAttribute("categories", categoryService.findAll());
        return "/view/create";
    }

    @PostMapping("/update")
    public String doUpdate(@Validated @ModelAttribute("question") Question question, BindingResult bindingResult,
                           Model model, RedirectAttributes rd) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("categories", categoryService.findAll());
            return "/view/create";
        }
        question.setCategory(categoryService.findById(question.getCategory().getCategoryId()));
        question.setStatus("wait");
        question.setDateCreate(LocalDate.now());
        questionService.update(question);
        rd.addFlashAttribute("message", "Update Successfully");
        return "redirect:/product/list";
    }

    @GetMapping("/delete/{id}")
    public String doDelete(@PathVariable Long id, RedirectAttributes rd) {
        questionService.deleteById(id);
        rd.addFlashAttribute("message", "Delete Successfully");
        return "redirect:/question/list";
    }

    @GetMapping("/searchTitle")
    public String searchTitle(@RequestParam("title1") String title1, Model model,
                             @RequestParam("page") Optional<Integer> page,
                             @RequestParam("size") Optional<Integer> size) {
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(5);
        model.addAttribute("title1", title1);
        Page<Question> questions = questionService.searchByTitle(title1,PageRequest.of(currentPage - 1, pageSize));
        model.addAttribute("questions", questions);
        return "/view/list";
    }

    @GetMapping("/searchAll")
    public String searchAll(@RequestParam("title") String title,
                            @RequestParam("categoryName") String categoryName, Model model,
                            @RequestParam("page") Optional<Integer> page,
                            @RequestParam("size") Optional<Integer> size) {
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(5);
        Page<Question> questions = questionService.searchAll(title, categoryName, PageRequest.of(currentPage - 1, pageSize));
        model.addAttribute("title", title);
        model.addAttribute("categoryName", categoryName);
        model.addAttribute("questions", questions);
        return "view/list";
    }

    @ExceptionHandler(SQLException.class)
    public String handleError(SQLException e, Model model) {
        model.addAttribute("error", e.getMessage());
        return "view/errorPage";
    }
}
