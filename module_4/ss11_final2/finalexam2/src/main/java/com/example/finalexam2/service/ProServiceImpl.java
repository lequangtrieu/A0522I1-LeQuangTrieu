package com.example.finalexam2.service;

import com.example.finalexam2.model.Product;
import com.example.finalexam2.repo.ProRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProServiceImpl implements ProService{
    @Autowired
    ProRepo proRepo;
    @Override
    public void create(Product product) {
        proRepo.save(product);
    }

    @Override
    public void update(Product product) {
        if (proRepo.existsById(product.getId())) {
            proRepo.save(product);
        }
    }

    @Override
    public void delete(int id) {
        proRepo.deleteById(id);
    }

    @Override
    public List<Product> search(String name) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return proRepo.findAll();
    }

    @Override
    public Product findById(int id) {
        return proRepo.findById(id).orElse(null);
    }
}
