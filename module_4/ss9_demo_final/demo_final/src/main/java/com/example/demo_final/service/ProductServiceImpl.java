package com.example.demo_final.service;

import com.example.demo_final.model.Product;
import com.example.demo_final.repo.ProductRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class ProductServiceImpl implements ProductService{
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
    public void delete(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Slice<Product> findAllWithSlice(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public void deleteAll(String[] ids) {

    }
}
