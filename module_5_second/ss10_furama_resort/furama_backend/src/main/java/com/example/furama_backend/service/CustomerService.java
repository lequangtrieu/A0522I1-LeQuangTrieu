package com.example.furama_backend.service;

import com.example.furama_backend.model.customer.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomer();
    void createCustomer(Customer customer);

    Customer getCustomerById(Integer id);

    void updateCustomer(Customer customer);

    void deleteCustomer(Customer customer);
}
