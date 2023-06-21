package com.example.blog.service;

import com.example.blog.model.Category;
import com.example.blog.repo.CateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CateServiceImpl implements CateService{
    @Autowired
    CateRepo repo;
    @Override
    public void create(Category category) {
        repo.save(category);
    }

    @Override
    public void update(Category category) {
        if (repo.existsById(category.getCategoryId())) {
            repo.save(category);
        }
    }

    @Override
    public Category findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Category> findAll() {
        return (List<Category>) repo.findAll();
    }

    @Override
    public void deleteById(int id) {
        repo.deleteById(id);
    }
}
