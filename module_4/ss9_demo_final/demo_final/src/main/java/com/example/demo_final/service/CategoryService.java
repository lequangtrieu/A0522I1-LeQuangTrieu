package com.example.demo_final.service;

import com.example.demo_final.model.Category;

import java.util.List;

public interface CategoryService {
    void create(Category category);
    void update(Category category);
    void delete(int id);
    List<Category> findAll();
    Category findById(Integer id);
}
