package service;

import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProductDTO {
    Scanner input = new Scanner(System.in);
    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from product");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                float price = resultSet.getFloat("price");
                Date dateRelease = resultSet.getDate("dateRelease");
                String status = resultSet.getString("status");
                int categoryId = resultSet.getInt("categoryId");

                Product product = new Product(id, name, price, dateRelease, status, categoryId);
                list.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void displayProducts() {
        List<Product> productList = this.getAllProduct();
        System.out.println("List all products");

// Header của bảng
        System.out.println(String.format("%-5s | %-20s | %-10s | %-15s | %-10s | %-10s", "ID", "Name", "Price", "Date Release", "Status", "Category ID"));
        System.out.println("------------------------------------------------------------------------------------------");

// Duyệt qua từng sản phẩm và hiển thị dưới dạng bảng
        for (Product product : productList) {
            String formattedProduct = String.format("%-5s | %-20s | %-10s | %-15s | %-10s | %-10s",
                    product.getId(), product.getName(), product.getPrice(), product.getDateRelease(), product.getStatus(), product.getCategoryId());
            System.out.println(formattedProduct);
        }
    }

    public void addNewProduct() {
        try {
            System.out.println("Input name:");
            String name = input.nextLine();
            System.out.println("Input price:");
            float price = Float.parseFloat(input.nextLine());
            System.out.println("Input dateRelease:");
            String dateString = input.nextLine();
            java.util.Date utilDate = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
            java.sql.Date dateRelease = new java.sql.Date(utilDate.getTime());
            System.out.println("Input status:");
            String status = input.nextLine();
            System.out.println("Input categoryId:");
            int categoryId = Integer.parseInt(input.nextLine());

            Connection connection = DBConnection.getConnection();
            String sql = "INSERT INTO product (name, price, dateRelease, status, categoryId) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setFloat(2, price);
            preparedStatement.setDate(3, dateRelease);
            preparedStatement.setString(4, status);
            preparedStatement.setInt(5, categoryId);
            preparedStatement.executeUpdate();
        } catch (ParseException | SQLException e) {
            e.printStackTrace();
        }
        System.out.println("add successfully");
    }

    public void updateProductById() {

    }

    public void deleteProductById() {

    }

    public void sortProductByName() {

    }

    public void searchProductByName() {

    }
}
