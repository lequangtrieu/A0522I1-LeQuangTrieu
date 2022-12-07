package ss12_Collection.Bt2_Collections;

import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static Product productManagement = new Product();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMenu: ");
            System.out.println("1. add new product: ");
            System.out.println("2. edit base on id: ");
            System.out.println("3. remove base on id: ");
            System.out.println("4. print list: ");
            System.out.println("5. search base on name: ");
            System.out.println("6. sort ascending price: ");
            System.out.println("7. sort descending price: ");
            System.out.println("8. exit: ");
            System.out.println("enter your choice: ");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("enter the id:"); int id = Integer.parseInt(input.nextLine());
                    System.out.println("enter the name:"); String name = input.nextLine();
                    System.out.println("enter the price:"); double price = Double.parseDouble(input.nextLine());
                    Product product = new Product(id, name, price);
                    productManagement.addProduct(product);
                    break;
                case 2:
                    
            }
        }
    }
}
