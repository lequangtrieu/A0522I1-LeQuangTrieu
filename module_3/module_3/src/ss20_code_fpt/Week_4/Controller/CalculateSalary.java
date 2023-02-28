package ss20_code_fpt.Week_4.Controller;

import ss20_code_fpt.Week_4.Service.MainEmployeeService;
import ss20_code_fpt.Week_4.Service.MainEmployeeServiceImpl;
import ss20_code_fpt.Week_4.Service.PartTimeEmployeeService;
import ss20_code_fpt.Week_4.Service.PartTimeEmployeeServiceImpl;

import java.util.Scanner;

public class CalculateSalary {
    private static final Scanner input = new Scanner(System.in);

    private static PartTimeEmployeeService partTimeEmployeeService = new PartTimeEmployeeServiceImpl();

    private static MainEmployeeService mainEmployeeService = new MainEmployeeServiceImpl();
    public static void calculateSalary() {
        while (true) {
            System.out.println("please choose the kind of employee you wanna calculate total salary:");
            System.out.println("1. Part-time employee");
            System.out.println("2. Main employee");
            System.out.println("3. Return main menu");
            System.out.println("enter your choice:");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    partTimeEmployeeService.calculate();
                    break;
                case 2:
                    mainEmployeeService.calculate();
                    break;
                case 3: return;
                default:
                    System.out.println("Invalid");
            }
        }
    }
}
