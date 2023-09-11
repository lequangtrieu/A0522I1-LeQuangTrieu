package com.example.final2.service;

import com.example.final2.model.Product;

import java.util.List;

public interface ProductService {
    void create(Product product);
    List<Product> findAll();
}
