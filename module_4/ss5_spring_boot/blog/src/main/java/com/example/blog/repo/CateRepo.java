package com.example.blog.repo;

import com.example.blog.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CateRepo extends CrudRepository<Category, Integer> {
}
