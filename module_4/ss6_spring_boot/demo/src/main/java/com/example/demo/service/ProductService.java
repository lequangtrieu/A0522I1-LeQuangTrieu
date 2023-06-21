package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

import java.util.List;

public interface ProductService extends Service<Product> {
    List<Product> findProductByName(String name);
    List<Product> findProductByPrice(double min, double max);

    Page<Product> findAllWithPaging(Pageable pageable);

    public Slice<Product> findAllWithSlice(Pageable pageable);
}
