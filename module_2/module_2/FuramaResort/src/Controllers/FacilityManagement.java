package Controllers;

import java.util.Scanner;

public class FacilityManagement {
    public static Scanner input = new Scanner(System.in);
    public static void manageFacility() {
        while (true) {
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
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
