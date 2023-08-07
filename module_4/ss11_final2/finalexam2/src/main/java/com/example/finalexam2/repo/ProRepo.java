package com.example.finalexam2.repo;

import com.example.finalexam2.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProRepo extends JpaRepository<Product, Integer> {

}
