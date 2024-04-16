package com.example.furama_backend.service;

import com.example.furama_backend.model.customer.CustomerType;
import com.example.furama_backend.repository.CustomerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerTypeServiceImpl implements CustomerTypeService{
    @Autowired
    CustomerTypeRepository customerTypeRepository;
    @Override
    public List<CustomerType> getAllCustomerType() {
        return customerTypeRepository.findAll();
    }
}
