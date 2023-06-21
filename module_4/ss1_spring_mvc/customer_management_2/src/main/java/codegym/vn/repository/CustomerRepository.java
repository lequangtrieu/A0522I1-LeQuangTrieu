package codegym.vn.repository;

import codegym.vn.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();

    void create(Customer customer);

    Customer findById(int id);

    void update(Customer customer);
    void delete(Customer customer);
}
