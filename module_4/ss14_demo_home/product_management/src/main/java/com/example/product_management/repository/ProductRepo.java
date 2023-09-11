package com.example.product_management.repository;

import com.example.product_management.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {
    List<Product> findAllByNameContaining(String name);
}
