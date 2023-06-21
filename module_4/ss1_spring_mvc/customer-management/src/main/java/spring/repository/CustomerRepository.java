package spring.repository;

import spring.model.Customer;

import java.util.List;

public interface CustomerRepository {
    void create(Customer customer);

    List<Customer> findAll();
}
