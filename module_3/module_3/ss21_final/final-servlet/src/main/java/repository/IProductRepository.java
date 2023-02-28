package repository;

import model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductRepository {
    List<Product> selectAllProduct();

    Product selectProduct(String key);

    boolean deleteProduct(String id) throws SQLException;

    void insertProduct(Product product) throws SQLException;

    List<Product> search(String keySearch);

    List<Product> searchFloor(String keySearch);
}
