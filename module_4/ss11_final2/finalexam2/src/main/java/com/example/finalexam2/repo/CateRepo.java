package com.example.finalexam2.repo;

import com.example.finalexam2.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CateRepo extends JpaRepository<Category, Integer> {
}
