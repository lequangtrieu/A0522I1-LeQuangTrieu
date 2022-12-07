package ss22_case_study.Controller;

import java.util.Scanner;

public class FuramaControllerMenu {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Main menu: ");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("\nEnter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    EmployeeManagement.manageEmployee(); break;
                case 2:
                    CustomerManagement.manageCustomer(); break;
                case 3:
                    FacilityManagement.manageFacility(); break;
                case 4:
                    BookingManagement.manageBooking(); break;
                case 5:
                    PromotionManagement.managePromotion(); break;
                case 6:
                    System.exit(6);
                default:
                    System.out.println("No choice");

            }
        }
    }




}
