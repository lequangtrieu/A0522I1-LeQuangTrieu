package ss20_code_fpt.Progress1.Controller;

import ss20_code_fpt.Progress1.Service.SaleEmployeeService;
import ss20_code_fpt.Progress1.Service.SaleEmployeeServiceImpl;

import java.util.Scanner;

public class SaleEmployeeController {
    private static final Scanner input = new Scanner(System.in);
    private static SaleEmployeeService saleEmployeeService = new SaleEmployeeServiceImpl();

    public static void sale() {
        while (true) {
            System.out.println("1. Input");
            System.out.println("2. Display");
            System.out.println("3. Check address");
            System.out.println("4. Remain main menu");
            System.out.println("enter your choice:");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    saleEmployeeService.input();
                    break;
                case 2:
                    saleEmployeeService.display();
                    break;
                case 3:
                    saleEmployeeService.checkAddress();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("invalid!"); break;
            }
        }
    }
}
