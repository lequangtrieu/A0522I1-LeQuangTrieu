package com.example.demo2.service;

import com.example.demo2.model.Product;
import com.example.demo2.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{
    @PersistenceContext
    EntityManager entityManager;
    @Autowired
    ProductRepo productRepo;

    @Override
    public void create(Product product) {
        productRepo.save(product);
    }

    @Override
    public void delete(int id) {
        productRepo.deleteById(id);
    }

    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public Product findById(int id) {
        return productRepo.findById(id).orElse(null);
    }

//    @Override
//    public List<Product> findProductByName(String name) {
//        return productRepo.findAllByNameContaining(name);
//    }

    @Override
    public void delete(List<Integer> ids) {
        productRepo.deleteByIdIn(ids);
    }

    @Override
    public List<Product> findProductByCateId(int cateId) {
        return productRepo.findByCategory_CategoryId(cateId);
    }

    @Override
    public List<Product> searchProducts(String keyword) {
//        String queryString = "SELECT p FROM Product p WHERE " +
//                "p.id LIKE :keyword OR " +
//                "p.name LIKE :keyword OR " +
//                "p.category LIKE :keyword OR " +
//                "p.price LIKE :keyword";
//
//        Query query = entityManager.createQuery(queryString, Product.class);
//        query.setParameter("keyword", "%" + keyword + "%");
//
//        return query.getResultList();
        return null;
    }

    @Override
    public Page<Product> getPageProduct(Pageable pageable) {
        return productRepo.findAll(pageable);
    }

    @Override
    public Page<Product> searchByName(String name, Pageable pageable) {
        return productRepo.findAllByNameContaining(name, pageable);
    }
}
