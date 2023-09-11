package com.example.product2.service;

import com.example.product2.model.Category;

import java.util.List;

public interface CategoryService {
    void create(Category category);
    void delete(Long id);
    List<Category> findAll();
    Category findById(Long id);
}
