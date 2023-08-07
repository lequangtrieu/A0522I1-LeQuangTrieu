package com.example.demo2.service;

import com.example.demo2.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    void create(Product product);
    void delete(int id);
    List<Product> findAll();
    Product findById(int id);
//    List<Product> findProductByName(String name);
    void delete(List<Integer> ids);

    List<Product> findProductByCateId(int cateId);

    List<Product> searchProducts(String keyword);

    Page<Product> getPageProduct(Pageable pageable);

    Page<Product> searchByName(String name,Pageable pageable);
}
