package ss20_code_fpt.Week_4.Controller;

import ss20_code_fpt.Week_4.Service.MainEmployeeService;
import ss20_code_fpt.Week_4.Service.MainEmployeeServiceImpl;
import ss20_code_fpt.Week_4.Service.PartTimeEmployeeService;
import ss20_code_fpt.Week_4.Service.PartTimeEmployeeServiceImpl;

import java.util.Scanner;

public class InputEmployee {
    private static final Scanner input = new Scanner(System.in);
    private static PartTimeEmployeeService partTimeEmployeeService = new PartTimeEmployeeServiceImpl();
    private static MainEmployeeService mainEmployeeService = new MainEmployeeServiceImpl();
    public static void inputEmployee() {
        while (true) {
            System.out.println("please choose the kind of employee you wanna input:");
            System.out.println("1. Part-time employee");
            System.out.println("2. Main employee");
            System.out.println("3. Return main menu");
            System.out.println("enter your choice:");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    partTimeEmployeeService.input();
                    break;
                case 2:
                    mainEmployeeService.input();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid");
            }
        }
    }
}
