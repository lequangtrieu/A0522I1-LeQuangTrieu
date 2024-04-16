package com.example.furama_backend.controller;

import com.example.furama_backend.model.customer.Customer;
import com.example.furama_backend.service.CustomerService;
import com.example.furama_backend.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
@CrossOrigin("*")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @Autowired
    CustomerTypeService customerTypeService;

    @GetMapping("")
    public ResponseEntity<List<Customer>> getAllCustomer() {
        List<Customer> customerList = customerService.getAllCustomer();
        System.out.println(customerList.get(0));
        return new ResponseEntity<>(customerList, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<String> createCustomer(@RequestBody Customer customer) {
        customerService.createCustomer(customer);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable(name = "id") Integer id) {
        Customer customer = customerService.getCustomerById(id);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCustomer(@PathVariable(name = "id") Integer id, @RequestBody Customer customer) {
        System.out.println(id);
        Customer existingCustomer = customerService.getCustomerById(id);
        if (existingCustomer == null) {
            return new ResponseEntity<>("Không tìm thấy khách hàng có ID: " + id, HttpStatus.NOT_FOUND);
        }
        // Update thông tin của khách hàng
        existingCustomer.setName(customer.getName());
        existingCustomer.setBirthday(customer.getBirthday());
        existingCustomer.setGender(customer.getGender());
        existingCustomer.setIdCard(customer.getIdCard());
        existingCustomer.setPhone(customer.getPhone());
        existingCustomer.setEmail(customer.getEmail());
        existingCustomer.setAddress(customer.getAddress());
        existingCustomer.setCustomerType(customer.getCustomerType());

        customerService.updateCustomer(existingCustomer);
        return new ResponseEntity<>("success", HttpStatus.OK);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCustomerById(@PathVariable(name = "id") Integer id) {
        System.out.println(id);
        Customer existingCustomer = customerService.getCustomerById(id);

        if (existingCustomer == null) {
            return new ResponseEntity<>("Không tìm thấy khách hàng có ID: " + id, HttpStatus.NOT_FOUND);
        }

        customerService.deleteCustomer(existingCustomer);
        return new ResponseEntity<>("Khách hàng có ID " + id + " đã được xóa", HttpStatus.OK);
    }
}
