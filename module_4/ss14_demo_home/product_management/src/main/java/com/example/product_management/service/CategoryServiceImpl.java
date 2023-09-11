package com.example.product_management.service;

import com.example.product_management.model.Category;
import com.example.product_management.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    CategoryRepo categoryRepo;
    @Override
    public void create(Category category) {
        categoryRepo.save(category);
    }

    @Override
    public void update(Category category) {
        if (categoryRepo.existsById(category.getCategoryId())) {
            categoryRepo.save(category);
        }
    }

    @Override
    public void deleteById(Long id) {
        categoryRepo.deleteById(id);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepo.findAll();
    }

    @Override
    public Category findById(Long id) {
        return categoryRepo.findById(id).orElse(null);
    }
}
