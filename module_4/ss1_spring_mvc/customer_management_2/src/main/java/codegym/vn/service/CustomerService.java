package codegym.vn.service;

import codegym.vn.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    void create(Customer customer);

    Customer findById(int id);

    void update(Customer customer);
    void delete(Customer customer);
}
