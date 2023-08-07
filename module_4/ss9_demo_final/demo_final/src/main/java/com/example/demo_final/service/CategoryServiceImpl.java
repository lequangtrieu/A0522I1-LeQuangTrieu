package com.example.demo_final.service;

import com.example.demo_final.model.Category;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{

    @Override
    public void create(Category category) {

    }

    @Override
    public void update(Category category) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Category> findAll() {
        return null;
    }

    @Override
    public Category findById(Integer id) {
        return null;
    }
}
