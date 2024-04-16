package com.example.furama_backend.controller;

import com.example.furama_backend.model.customer.CustomerType;
import com.example.furama_backend.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customerType")
@CrossOrigin("*")
public class CustomerTypeController {
    @Autowired
    CustomerTypeService customerTypeService;

    @GetMapping
    public ResponseEntity<List<CustomerType>> getAllCustomerType() {
        List<CustomerType> customerTypeList = customerTypeService.getAllCustomerType();
        return new ResponseEntity<>(customerTypeList, HttpStatus.OK);
    }
}
