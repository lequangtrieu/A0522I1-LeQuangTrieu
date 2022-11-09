package ss12_Collection.Bt1_ProductManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
    private static List arr = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMenu: ");
            System.out.println("1. add: ");
            System.out.println("2. edit: ");
            System.out.println("3. remove: ");
            System.out.println("4. print: ");
            System.out.println("5. search: ");
            System.out.println("6. sort ascending : ");
            System.out.println("7. sort descending: ");
            System.out.println("8. exit: ");
            System.out.println("enter your choice: ");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("enter the product you wanna add: ");
                    String product_add = input.nextLine();
                    arr.add(product_add);
                    System.out.println("adding successfully");
                    break;
                case 2:
                    System.out.println("enter the product you wanna edit: ");
                    String product_edit = input.nextLine();

                    if (!arr.contains(product_edit)) {
                        System.out.println("the product invalid!");
                    } else {
                        System.out.println("enter the new product: ");
                        String product_new = input.nextLine();
                        arr.set(arr.indexOf(product_edit), product_new);
                    }
                    break;
                case 3:
                    System.out.println("enter the product you wanna remove: ");
                    String product_remove = input.nextLine();
                    if (!arr.contains(product_remove)) {
                        System.out.println("the product invalid!");
                    } else {
                        arr.remove(product_remove);
                    }
                    break;
                case 4:
                    System.out.println("the array is: ");
                    for (int i = 0; i < arr.size(); i++) {
                        System.out.print(arr.get(i)+ "\t");
                    }
                    break;
                case 5:
                    System.out.println("enter the product you wanna search: ");
                    String product_search = input.nextLine();
                    if (!arr.contains(product_search)) {
                        System.out.println("the product invalid!");
                    } else {
                        System.out.println("the index is: " + arr.indexOf(product_search));
                    }
                    break;
                case 8:
                    System.exit(8);

            }
        }

    }
}
