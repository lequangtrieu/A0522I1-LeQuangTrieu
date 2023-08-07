package com.example.demo2.repo;

import com.example.demo2.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CateRepo extends JpaRepository<Category, Integer> {
}
