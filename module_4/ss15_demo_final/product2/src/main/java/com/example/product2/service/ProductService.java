package com.example.product2.service;

import com.example.product2.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    void create(Product product);
    void update(Product product);
    void deleteById(Long id);
    void deleteAll(List<Long> ids);
    Page<Product> findAll(Pageable pageable);
    Page<Product> searchByName(String name, Pageable pageable);
    Page<Product> searchAll(String name, String status, Pageable pageable);
}
