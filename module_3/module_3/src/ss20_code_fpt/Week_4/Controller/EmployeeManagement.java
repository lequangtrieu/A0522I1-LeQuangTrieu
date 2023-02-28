package ss20_code_fpt.Week_4.Controller;

import java.util.List;
import java.util.Scanner;

public class EmployeeManagement {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. input");
            System.out.println("2. display");
            System.out.println("3. calculate salary");
            System.out.println("5. Sum");
            System.out.println("4.Exit");
            System.out.println("enter your choice:");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    InputEmployee.inputEmployee(); break;
                case 2:
                    DisplayEmployee.displayEmployee(); break;
                case 3:
                    CalculateSalary.calculateSalary(); break;
                case 4:
                    System.exit(4);
                    break;
                case 5:

                    break;
                default:
                    System.out.println("Invalid");
            }
        }
    }
}
