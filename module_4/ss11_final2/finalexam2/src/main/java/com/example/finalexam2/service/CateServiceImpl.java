package com.example.finalexam2.service;

import com.example.finalexam2.model.Category;
import com.example.finalexam2.repo.CateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CateServiceImpl implements CateService{
    @Autowired
    CateRepo cateRepo;
    @Override
    public void create(Category category) {
        cateRepo.save(category);
    }

    @Override
    public void update(Category category) {
        if (cateRepo.existsById(category.getCategoryId())) {
            cateRepo.save(category);
        }
    }

    @Override
    public void delete(int id) {
        cateRepo.deleteById(id);
    }

    @Override
    public List<Category> findAll() {
        return cateRepo.findAll();
    }

    @Override
    public Category findById(int id) {
        return cateRepo.findById(id).orElse(null);
    }
}
