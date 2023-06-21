package com.example.demo.repository.impl;


import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public class ProductRepositoryImpl implements ProductRepository {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void create(Product product) {
        entityManager.persist(product);
    }

    @Override
    public void update(Product product) {
        entityManager.merge(product);
    }

    @Override
    public Product findById(int id) {
        return entityManager.find(Product.class, id);
    }

    @Override
    public List<Product> findAll() {
        return entityManager.createQuery("select p from Product p").getResultList();
    }

    @Override
    public void deleteById(int id) {
        entityManager.remove(findById(id));
    }

    @Override
    public List<Product> findProductByName(String name) {
        List<Product> productList = entityManager.createQuery(
                        "select p from Product p where p.name like :name")
                .setParameter("name", "%" + name + "%").getResultList();
//        productList = entityManager.createNamedQuery("findProductByName")
//                .setParameter("name", name).getResultList();
        return productList;
    }

    @Override
    public List<Product> findProductByPrice(double min, double max) {
        List<Product> productList = entityManager.createQuery(
                        "select p from Product p where p.price between ?1 and ?2")
                .setParameter(1, min)
                .setParameter(2, max)
                .getResultList();
        return null;
    }
}
