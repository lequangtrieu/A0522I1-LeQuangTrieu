package Controllers;

import Services.EmployeeService;
import Services.Implement.EmployeeServiceImp;

import java.util.Scanner;

public class EmployeeManagement {
    public static Scanner input = new Scanner(System.in);

    private static EmployeeService employeeService = new EmployeeServiceImp();
    public static void manageEmployee() {
        while (true) {
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
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
