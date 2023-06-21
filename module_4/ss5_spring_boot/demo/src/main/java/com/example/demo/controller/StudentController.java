package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("/list")
    public String list(Model model) {
        List<Student> students = service.findAll();
        model.addAttribute("students", students);
        return"student/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "student/create";
    }

    @PostMapping("/create")
    public String doCreate(@ModelAttribute(name = "student") Student student, Model model, RedirectAttributes rd) {
        service.create(student);
        rd.addFlashAttribute("message", "Thêm mới student thành công");
        return "redirect:/student/list";
    }

    @GetMapping("/update")
    public String showUpdate(@RequestParam String id, Model model) {
        model.addAttribute("student", service.findById(id));
        return "customer/update";
    }



}