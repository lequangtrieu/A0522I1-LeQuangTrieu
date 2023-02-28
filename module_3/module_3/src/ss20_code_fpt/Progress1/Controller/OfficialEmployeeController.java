package ss20_code_fpt.Progress1.Controller;

import ss20_code_fpt.Progress1.Service.OfficialEmployeeService;
import ss20_code_fpt.Progress1.Service.OfficialEmployeeServiceImpl;

import java.util.Scanner;

public class OfficialEmployeeController {
    private static final Scanner input = new Scanner(System.in);
    private static OfficialEmployeeService officialEmployeeService = new OfficialEmployeeServiceImpl();

    public static void official() {
        while (true) {
            System.out.println("1. Input");
            System.out.println("2. Display");
            System.out.println("3. Check address");
            System.out.println("4. Remain main menu");
            System.out.println("enter your choice:");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    officialEmployeeService.input();
                    break;
                case 2:
                    officialEmployeeService.display();
                    break;
                case 3:
                    officialEmployeeService.checkAddress();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("invalid!"); break;
            }
        }
    }
}
