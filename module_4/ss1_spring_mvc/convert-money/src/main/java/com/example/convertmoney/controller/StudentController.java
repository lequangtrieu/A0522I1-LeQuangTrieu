package com.example.convertmoney.controller;

import com.example.convertmoney.model.Calculator;
import com.example.convertmoney.service.CalculatorServiceImpl;
import com.example.convertmoney.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/demo")
public class StudentController {
    @Autowired
    private ICalculatorService calculatorService;

    @GetMapping("/home")
    public String displayCalculator() {
        return "home";
    }

    @PostMapping("/result")
    public String displayResult(@RequestParam double usd, @RequestParam double rate, Model model) {
        double result = calculatorService.convert(usd, rate);
        Calculator calculator = new Calculator(usd, rate, result);
        model.addAttribute("calculator", calculator);
        return"result";
    }
}
