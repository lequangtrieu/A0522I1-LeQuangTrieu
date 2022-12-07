package ss22_case_study.Controller;

import java.util.Scanner;

public class BookingManagement {
    public static Scanner input = new Scanner(System.in);
    public static void manageBooking() {
        while (true) {
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return;
            }
        }
    }
}
