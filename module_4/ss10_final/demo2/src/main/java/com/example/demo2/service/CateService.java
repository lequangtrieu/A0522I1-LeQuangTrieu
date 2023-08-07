package com.example.demo2.service;

import com.example.demo2.model.Category;

import java.util.List;

public interface CateService {
    void create(Category category);
    void delete(int id);
    List<Category> findAll();
    Category findById(int id);
}
