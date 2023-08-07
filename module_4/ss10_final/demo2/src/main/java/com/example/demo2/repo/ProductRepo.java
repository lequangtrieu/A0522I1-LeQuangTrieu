package com.example.demo2.repo;

import com.example.demo2.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Integer> {
    void deleteByIdIn(List<Integer> ids);
//    List<Product> findAllByNameContaining(String name);
    List<Product> findByCategory_CategoryId(int id);

    Page<Product> findAllByNameContaining(String name, Pageable pageable);

}