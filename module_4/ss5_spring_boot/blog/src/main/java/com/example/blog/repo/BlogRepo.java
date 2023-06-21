package com.example.blog.repo;

import com.example.blog.model.Blog;
import org.springframework.data.repository.CrudRepository;

public interface BlogRepo extends CrudRepository<Blog, Integer> {
}
