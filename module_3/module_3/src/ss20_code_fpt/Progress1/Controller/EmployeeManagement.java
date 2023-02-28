package ss20_code_fpt.Progress1.Controller;

import java.util.Scanner;

public class EmployeeManagement {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Official Employee");
            System.out.println("2. Sale Employee");
            System.out.println("3. Exit");
            System.out.println("enter your choice:");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    OfficialEmployeeController.official();
                    break;
                case 2:
                    SaleEmployeeController.sale();
                    break;
                case 3:
                    System.exit(3);
                default:
                    System.out.println("invalid!"); break;
            }
        }
    }
}
