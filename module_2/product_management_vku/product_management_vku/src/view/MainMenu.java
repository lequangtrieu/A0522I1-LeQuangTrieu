package view;

import DTO.ProductDTO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {
    private ProductDTO productDTO;

    public MainMenu() {
        setTitle("Product Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel(new BorderLayout());

        JLabel titleLabel = new JLabel("===== PRODUCT MANAGEMENT =====", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(titleLabel, BorderLayout.NORTH);

        JPanel menuPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.insets = new Insets(5, 10, 5, 10);

        String[] menuItems = {
                "Display all product",
                "Add new product",
                "Updating product",
                "Delete product by ID",
                "Sorting product by NAME",
                "Search product by NAME",
                "End program"
        };

        for (String menuItem : menuItems) {
            JButton button = new JButton(menuItem);
            button.setPreferredSize(new Dimension(200, 30));
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    handleMenuChoice(menuItem);
                }
            });

            menuPanel.add(button, gbc);
        }

        panel.add(menuPanel, BorderLayout.CENTER);
        add(panel);
    }

    private void handleMenuChoice(String choice) {
        switch (choice) {
            case "Display all product":
                SwingUtilities.invokeLater(() -> {
                    ProductList frame = new ProductList();
                    frame.setVisible(true);
                });
                break;
            case "Add new product":
                SwingUtilities.invokeLater(() -> {
                    AddProductFrame addProductFrame = new AddProductFrame();
                    addProductFrame.setVisible(true);
                });
                break;
            case "Updating product":
//                productDTO.updateProductById();
                break;
            case "Delete product by ID":
//                productDTO.deleteProductById();
                break;
            case "Sorting product by NAME":
//                productDTO.sortProductByName();
                break;
            case "Search product by NAME":
//                productDTO.searchProductByName();
                break;
            case "End program":
                System.exit(0);
                break;
            default:
                break;
        }
    }
}
