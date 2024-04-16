package view;

import DTO.ProductDTO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductList extends JFrame {
    public ProductList() {
        setTitle("Product List");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel(new BorderLayout());

        DefaultTableModel tableModel = new DefaultTableModel();
        JTable table = new JTable(tableModel);

        tableModel.addColumn("ID");
        tableModel.addColumn("Name");
        tableModel.addColumn("Price");
        tableModel.addColumn("Date Release");
        tableModel.addColumn("Status");
        tableModel.addColumn("Category ID");

        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane, BorderLayout.CENTER);

        JButton backButton = new JButton("Back to main menu");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Đóng frame hiện tại khi quay về trang menu
                // Gọi trang menu ở đây (ví dụ: MainMenuFrame là tên frame của trang menu)
//                MainMenu mainMenu = new MainMenu();
//                mainMenu.setVisible(true);
            }
        });
        panel.add(backButton, BorderLayout.SOUTH);

        getContentPane().add(panel);
        displayProducts(tableModel);
    }

    private void displayProducts(DefaultTableModel tableModel) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.displayProducts(tableModel);
    }
}
