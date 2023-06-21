package com.example.demo.service;

import com.example.demo.model.Product;

import java.util.List;

public interface ProductService extends Service<Product> {
    List<Product> findProductByName(String name);
    List<Product> findProductByPrice(double min, double max);
}
