package com.example.final3.controller;

import com.example.final3.model.KhuyenMai;
import com.example.final3.service.KhuyenMaiService;
import com.example.final3.validation.KhuyenMaiValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/km")
public class KhuyenMaiController {
    @Autowired
    KhuyenMaiService khuyenMaiService;

    @Autowired
    KhuyenMaiValidate validate;

    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("kms", khuyenMaiService.findAll());
        return "/view/km/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("km", new KhuyenMai());
        return "/view/km/create";
    }

    @PostMapping("/create")
    public String doCreate(@Valid @ModelAttribute("km") KhuyenMai km, RedirectAttributes rd,
                           BindingResult bindingResult, Model model) {
        validate.validate(km, bindingResult);
        if (bindingResult.hasErrors()) {
            List<KhuyenMai> khuyenMais = khuyenMaiService.findAll();
//            model.addAttribute("km", khuyenMais);
            return "/view/km/create";
        }
        khuyenMaiService.create(km);
        rd.addFlashAttribute("message", "Create Successfully");
        return "redirect:/km/list";
    }

    @GetMapping("/delete/{id}")
    public String doDelete(@PathVariable int id, RedirectAttributes rd) {
        khuyenMaiService.delete(id);
        rd.addFlashAttribute("message", "Delete Successfully");
        return "redirect:/km/list";
    }
}
