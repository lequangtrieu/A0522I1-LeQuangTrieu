package Controllers;

import java.util.Scanner;

public class PromotionManagement {
    public static Scanner input = new Scanner(System.in);
    public static void managePromotion() {
        while (true) {
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    return;
            }
        }
    }
}
