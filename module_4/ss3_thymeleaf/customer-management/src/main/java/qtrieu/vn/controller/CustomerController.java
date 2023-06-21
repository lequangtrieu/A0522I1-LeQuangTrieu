package qtrieu.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import qtrieu.vn.model.Customer;
import qtrieu.vn.service.IService;
import qtrieu.vn.service.Service;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    private final IService service = new Service();

    @GetMapping("")
    public String index(Model model) {
        List<Customer> customerList = service.findAll();
        model.addAttribute("customers", customerList);
        return "/list";
    }
}
