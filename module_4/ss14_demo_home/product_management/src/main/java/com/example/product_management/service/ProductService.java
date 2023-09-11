package com.example.product_management.service;

import com.example.product_management.model.Product;

import java.util.List;

public interface ProductService {
    void create(Product product);
    void update(Product product);
    void deleteById(Long id);
    List<Product> findAll();
    Product findById(Long id);

    List<Product> searchByName(String name);
}
