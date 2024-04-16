package DTO;

import model.Product;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductDTO {

    public List<Product> getAllProduct() {

        List<Product> list = new ArrayList<>();
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from product");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String price = resultSet.getString("price");
                String dateRelease = resultSet.getString("dateRelease");
                String status = resultSet.getString("status");
                int categoryId = resultSet.getInt("category_id");

                Product product = new Product(id, name, price, dateRelease, status, categoryId);
                list.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public void displayProducts(DefaultTableModel tableModel) {
        // Lấy danh sách sản phẩm từ getAllProduct()
        List<Product> productList = getAllProduct();

        // Duyệt qua danh sách sản phẩm và thêm vào tableModel
        for (Product product : productList) {
            Object[] rowData = {
                    product.getId(),
                    product.getName(),
                    product.getPrice(),
                    product.getDateRelease(),
                    product.getStatus(),
                    product.getCategoryId()
            };
            tableModel.addRow(rowData);
        }
    }
}
