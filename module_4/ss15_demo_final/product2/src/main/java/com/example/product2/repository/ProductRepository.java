package com.example.product2.repository;

import com.example.product2.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findAllByNameContaining(String name, Pageable pageable);
    Page<Product> findAllByNameContainingAndStatusContaining(String name, String status, Pageable pageable);
}
