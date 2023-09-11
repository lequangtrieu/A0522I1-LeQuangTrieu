package com.example.final_md4.service;

import com.example.final_md4.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category findById(Long id);
}
