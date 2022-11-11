package ss12_Collection.Bt1_ProductManagement;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Product productManagement = new Product();

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
                    System.out.println("id: "); String id = input.nextLine();
                    System.out.println("name: "); String name = input.nextLine();
                    System.out.println("price: "); double price = Double.parseDouble(input.nextLine());
                    Product product = new Product(id, name, price);
                    productManagement.addProduct(product);
                    break;
                case 2:
                    productManagement.editId();
                    break;
                case 3:
                    productManagement.removeId();
                    break;
                case 4:
                    productManagement.printList();
                    break;
                case 5:
                    productManagement.searchName();
                    break;
                case 6:
                    productManagement.sortAscending();
                    break;
                case 7:
                    productManagement.sortDescending();
                    break;
                case 8:
                    System.exit(8);

            }
        }
    }
}
