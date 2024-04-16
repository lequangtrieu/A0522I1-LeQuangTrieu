package controller;

import service.ProductDTO;

import java.util.Scanner;

public class ProductController {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProductDTO productDTO = new ProductDTO();
        while (true) {
            System.out.println("===== PRODUCT MANAGEMENT =====");
            System.out.println("Main menu");
            System.out.println("1. Display all product");
            System.out.println("2. Add new product");
            System.out.println("3. Updating product");
            System.out.println("4. Delete product by ID");
            System.out.println("5. Sorting product by NAME");
            System.out.println("6. Search product by NAME");
            System.out.println("7. End program");
            System.out.println("Please choose your choice");

            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    productDTO.displayProducts();
                    break;
                case 2:
                    productDTO.addNewProduct();
                    break;
                case 3:
                    productDTO.updateProductById();
                    break;
                case 4:
                    productDTO.deleteProductById();
                    break;
                case 5:
                    productDTO.sortProductByName();
                    break;
                case 6:
                    productDTO.searchProductByName();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Please enter choice follow menu");
            }
        }

    }
}
