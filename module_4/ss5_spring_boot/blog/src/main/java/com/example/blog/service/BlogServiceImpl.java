package com.example.blog.service;

import com.example.blog.model.Blog;
import com.example.blog.repo.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService{
    @Autowired
    BlogRepo repository;

    @Override
    public void create(Blog blog) {
        repository.save(blog);
    }

    @Override
    public void update(Blog blog) {
        if (repository.existsById(blog.getId())) {
            repository.save(blog);
        }
    }

    @Override
    public Blog findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Blog> findAll() {
        return (List<Blog>) repository.findAll();
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
