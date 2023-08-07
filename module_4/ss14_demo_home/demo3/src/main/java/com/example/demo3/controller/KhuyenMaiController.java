package com.example.demo3.controller;

import com.example.demo3.model.KhuyenMai;
import com.example.demo3.service.KhuyenMaiService;
import com.example.demo3.validation.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/km")
public class KhuyenMaiController {

    @Autowired
    KhuyenMaiService khuyenMaiService;

    @Autowired
    Validate validate;
    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("khuyenmais", khuyenMaiService.findAll());
        return "view/list";
    }
    @GetMapping("/create")
    public String showCreate(Model model) {
        KhuyenMai khuyenMai = new KhuyenMai();
        model.addAttribute("khuyenmai", khuyenMai);
        return "view/create";
    }
    @PostMapping("/create")
    public String doCreate(@Valid @ModelAttribute(name = "khuyenmai") KhuyenMai khuyenmai,
                           BindingResult bindingResult, Model model) {
        validate.validate(khuyenmai, bindingResult);
        if (bindingResult.hasErrors()) {
            return "view/create";
        }
        khuyenMaiService.create(khuyenmai);
        return "redirect:/km/list";
    }
    @GetMapping("/delete/{id}")
    public String doDelete(@PathVariable int id) {
        khuyenMaiService.delete(id);
        return "redirect:/km/list";
    }

    @GetMapping("/searchName")
    public String search(@RequestParam("name") String name, Model model) {
        List<KhuyenMai> kmList = khuyenMaiService.searchByName(name);
        model.addAttribute("khuyenmais", kmList);
        model.addAttribute("name", name);
        return "view/list";
    }




}
