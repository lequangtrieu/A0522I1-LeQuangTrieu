package codegym.vn.controller;

import codegym.vn.model.Customer;
import codegym.vn.service.CustomerService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.rmi.CORBA.Stub;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/list")
    public String displayList(Model model) {
        model.addAttribute("customers", customerService.findAll());
        return "customer/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "customer/create";
    }

    @PostMapping("/create")
    public String doCreate(@ModelAttribute(name = "customer") Customer customer, Model model, RedirectAttributes rd) {
        customerService.create(customer);
        rd.addFlashAttribute("message", "Thêm mới student thành công");
        return "redirect:/customer/list";
    }

    @GetMapping("/update")
    public String showUpdate(Model model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "customer/update";
    }

    @PostMapping("/update")
    public String doUpdate(@ModelAttribute(name = "customer") Customer customer, Model model, RedirectAttributes rd) {
        customerService.update(customer);
        return "redirect:/customer/list";
    }
}
