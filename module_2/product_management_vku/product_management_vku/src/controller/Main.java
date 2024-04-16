package controller;

import view.MainMenu;
import view.ProductList;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainMenu frame = new MainMenu();
            frame.setVisible(true);
        });
    }
}
