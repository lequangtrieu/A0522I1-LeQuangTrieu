package Controllers;

import java.util.Scanner;

public class CustomerManagement {
    public static Scanner input = new Scanner(System.in);
    public static void manageCustomer() {
        while (true) {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return;
            }
        }

    }
}
