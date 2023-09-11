package com.example.product_management.service;

import com.example.product_management.model.Category;

import java.util.List;

public interface CategoryService {
    void create(Category category);
    void update(Category category);
    void deleteById(Long id);
    List<Category> findAll();

    Category findById(Long id);
}
