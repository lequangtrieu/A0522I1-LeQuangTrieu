package service;

import entity.Product;

import java.util.List;

public interface ProductService {
    void add(Product product);
    void update(Product product);
    List<Product> getAllProduct();
    void delete(String id);

}
