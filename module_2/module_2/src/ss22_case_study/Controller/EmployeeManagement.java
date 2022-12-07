package ss22_case_study.Controller;

import ss22_case_study.Services.EmployeeService;
import ss22_case_study.Services.Implement.EmployeeServiceImp;

import java.util.Scanner;

public class EmployeeManagement {
    private static final Scanner input = new Scanner(System.in);
    private static EmployeeService employeeServiceImp = new EmployeeServiceImp();

    public static void manageEmployee() {
        while (true) {
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    employeeServiceImp.display();
                    break;
                case 2:
                    employeeServiceImp.add();
                    break;
                case 3:
                    employeeServiceImp.editInfo();
                    break;
                case 4:
                    return;
            }
        }
    }
}
