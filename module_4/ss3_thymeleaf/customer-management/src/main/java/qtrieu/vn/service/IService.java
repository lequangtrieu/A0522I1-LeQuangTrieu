package qtrieu.vn.service;

import qtrieu.vn.model.Customer;

import java.util.List;

public interface IService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void update(int id, Customer customer);

    void remove(int id);
}
