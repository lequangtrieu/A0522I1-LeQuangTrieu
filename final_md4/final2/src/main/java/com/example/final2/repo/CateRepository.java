package com.example.final2.repo;

import com.example.final2.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CateRepository extends JpaRepository<Category, Integer> {
}
