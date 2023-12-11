package service;

import entity.Product;
import service.connection.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService{
    @Override
    public void add(Product product) {

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();

        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from product;");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
