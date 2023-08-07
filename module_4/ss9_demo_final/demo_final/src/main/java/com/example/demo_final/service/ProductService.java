package com.example.demo_final.service;

import com.example.demo_final.model.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

import java.util.List;

public interface ProductService {
    void create(Product product);
    void update(Product product);
    void delete(int id);
    List<Product> findAll();
    Product findById(int id);
    Slice<Product> findAllWithSlice(Pageable pageable);
    void deleteAll(String[] ids);
}
