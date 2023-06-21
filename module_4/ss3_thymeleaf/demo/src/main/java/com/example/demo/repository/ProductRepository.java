package com.example.demo.repository;

import com.example.demo.model.Product;

import java.util.List;

public interface ProductRepository extends Repository<Product> {
    List<Product> findProductByName(String name);
    List<Product> findProductByPrice(double min, double max);
}
