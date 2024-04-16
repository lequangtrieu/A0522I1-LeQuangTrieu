package view;
import DTO.DBConnection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddProductFrame extends JFrame {
    private JTextField nameField, priceField, dateReleaseField, statusField, categoryIdField;

    public AddProductFrame() {
        setTitle("Add New Product");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        panel.add(nameLabel);
        panel.add(nameField);

        JLabel priceLabel = new JLabel("Price:");
        priceField = new JTextField();
        panel.add(priceLabel);
        panel.add(priceField);

        JLabel dateReleaseLabel = new JLabel("Date Release:");
        dateReleaseField = new JTextField();
        panel.add(dateReleaseLabel);
        panel.add(dateReleaseField);

        JLabel statusLabel = new JLabel("Status:");
        statusField = new JTextField();
        panel.add(statusLabel);
        panel.add(statusField);

        JLabel categoryIdLabel = new JLabel("Category ID:");
        categoryIdField = new JTextField();
        panel.add(categoryIdLabel);
        panel.add(categoryIdField);

        JButton addButton = new JButton("Add Product");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNewProduct();
            }
        });
        panel.add(addButton);

        JButton backButton = new JButton("Back to main menu");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Đóng frame hiện tại
            }
        });
        panel.add(backButton);

        getContentPane().add(panel);
    }

    private void addNewProduct() {
        try {
            Connection connection = DBConnection.getConnection();
            String name = nameField.getText();
            String price = priceField.getText();
            String dateRelease = dateReleaseField.getText();
            String status = statusField.getText();
            int categoryId = Integer.parseInt(categoryIdField.getText());

            String sql = "INSERT INTO product (name, price, dateRelease, status, category_id) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, price);
            preparedStatement.setString(3, dateRelease);
            preparedStatement.setString(4, status);
            preparedStatement.setInt(5, categoryId);
            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(this, "Product added successfully");
            dispose(); // Đóng frame sau khi thêm sản phẩm thành công
        } catch (SQLException | NumberFormatException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to add product");
        }
    }
}

