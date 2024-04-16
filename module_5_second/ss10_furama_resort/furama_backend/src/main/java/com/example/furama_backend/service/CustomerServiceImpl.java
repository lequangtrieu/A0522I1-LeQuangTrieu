package com.example.furama_backend.service;

import com.example.furama_backend.model.customer.Customer;
import com.example.furama_backend.repository.CustomerRepository;
import com.example.furama_backend.repository.CustomerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.getAllCustomer2();
    }

    @Override
    public void createCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(Integer id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        customerRepository.delete(customer);
    }
}
