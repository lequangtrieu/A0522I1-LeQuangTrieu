package com.example.demo.repo;

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface ProductRepository extends JpaR1epository<Product, Integer> {
    List<Product> findAllByNameContaining(String name);

    List<Product> findAllByCategoryContaining(String cateName);

    List<Product> findAllByBeginPriceContaining(Double beginPrice);

//    List<Product> findAllByIdAndNameAndBeginPriceAndCategoryCategoryNameAndStatusContaining(int id, );

//    List<Product> findAllByNameContaining(String name, Pageable pageable);
}
