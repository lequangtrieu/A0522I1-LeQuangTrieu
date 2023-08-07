package com.example.spring_security.controller;

import com.example.spring_security.model.Account;
import com.example.spring_security.model.AccountRole;
import com.example.spring_security.repo.AccountRepository;
import com.example.spring_security.repo.AccountRoleRepository;
import com.example.spring_security.repo.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountRepository accountRepository;
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    AccountRoleRepository accountRoleRepository;

    @GetMapping("/create")
    public String displayCreate(Model model){
        model.addAttribute("account", new Account());
        return "account/create";
    }

    @PostMapping("/create")
    public String doCreate(Model model, @ModelAttribute("account") Account account) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        account.setPassword(encoder.encode(account.getPassword()));
        accountRepository.save(account);
        return "index";
    }

    @GetMapping("/addRole")
    public String displayAddRole(Model model) {
        model.addAttribute("accountRole", new AccountRole());
        model.addAttribute("roles", roleRepository.findAll());
        model.addAttribute("accounts", accountRepository.findAll());
        return "/account/addRole";
    }

    @PostMapping("/addRole")
    public String doAddRole(@ModelAttribute("accountRole") AccountRole accountRole) {
        accountRoleRepository.save(accountRole);
        return "index";
    }
}
