package com.example.demo.service;

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

import java.util.List;

public interface ProductService extends Service<Product> {
    List<Product> findProductByName(String name);

    Slice<Product> findAllWithSlice(Pageable pageable);
    List<Product> findProductByCategoryName(String category);

    List<Product> findProductByPrice(Double beginPrice);

//    Slice<Product> findProductByNameSlice(String name, Pageable pageable);
}
