package com.example.product2.service;

import com.example.product2.model.Product;
import com.example.product2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;
    @Override
    public void create(Product product) {
        productRepository.save(product);
    }

    @Override
    public void update(Product product) {
        if (productRepository.existsById(product.getId())) {
            productRepository.save(product);
        }
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public void deleteAll(List<Long> ids) {
        productRepository.deleteAllById(ids);
    }

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Page<Product> searchByName(String name, Pageable pageable) {
        return productRepository.findAllByNameContaining(name, pageable);
    }

    @Override
    public Page<Product> searchAll(String name, String status, Pageable pageable) {
        return productRepository.findAllByNameContainingAndStatusContaining(name, status, pageable);
    }
}
