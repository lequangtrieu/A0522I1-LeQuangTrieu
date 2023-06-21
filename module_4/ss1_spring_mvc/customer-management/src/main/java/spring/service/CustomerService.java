package spring.service;

import spring.model.Customer;

import java.util.List;

public interface CustomerService {
    void create(Customer customer);

    List<Customer> findAll();
}
