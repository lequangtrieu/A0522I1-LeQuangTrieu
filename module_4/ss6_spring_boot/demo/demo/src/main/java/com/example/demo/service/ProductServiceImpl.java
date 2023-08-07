package com.example.demo.service;

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.logging.Logger;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    private Logger logger = Logger.getLogger(ProductServiceImpl.class.getName());
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
    public Product findById(int id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public List<Product> findAll() {
//        logger.info("Run findAll method");
        return productRepository.findAll();
    }

    @Override
    public void deleteById(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> findProductByName(String name) {
        return productRepository.findAllByNameContaining(name);
    }

    @Override
    public Slice<Product> findAllWithSlice(Pageable pageable) {
//        logger.info("Run findAll method");
        return productRepository.findAll(pageable);
    }

    @Override
    public List<Product> findProductByCategoryName(String category) {
        return productRepository.findAllByCategoryContaining(category);
    }

    @Override
    public List<Product> findProductByPrice(Double beginPrice) {
        return productRepository.findAllByBeginPriceContaining(beginPrice);
    }

}
