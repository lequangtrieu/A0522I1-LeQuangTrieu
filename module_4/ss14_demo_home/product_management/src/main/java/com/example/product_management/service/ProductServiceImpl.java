package com.example.product_management.service;

import com.example.product_management.model.Product;
import com.example.product_management.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepo productRepo;
    @Override
    public void create(Product product) {
        productRepo.save(product);
    }

    @Override
    public void update(Product product) {
        if (productRepo.existsById(product.getId())) {
            productRepo.save(product);
        }
    }

    @Override
    public void deleteById(Long id) {
        productRepo.deleteById(id);
    }

    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public Product findById(Long id) {
        return productRepo.findById(id).orElse(null);
    }

    @Override
    public List<Product> searchByName(String name) {
        return productRepo.findAllByNameContaining(name);
    }
}
