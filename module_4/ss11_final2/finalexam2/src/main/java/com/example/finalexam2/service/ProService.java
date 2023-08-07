package com.example.finalexam2.service;

import com.example.finalexam2.model.Product;

import java.util.List;

public interface ProService {
    void create(Product product);
    void update(Product product);
    void delete(int id);
    List<Product> search(String name);
    List<Product> findAll();

    Product findById(int id);
}
