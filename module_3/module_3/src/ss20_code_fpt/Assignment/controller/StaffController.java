package ss20_code_fpt.Assignment.controller;

import ss20_code_fpt.Assignment.Utils.RegexMenu;
import ss20_code_fpt.Assignment.service.IService;
import ss20_code_fpt.Assignment.service.Service;


public class StaffController {

    private static final IService service = new Service();
    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Read File");
            System.out.println("2. Display");
            System.out.println("3. Remove");
            System.out.println("4. Update");
            System.out.println("5. Find to salary");
            System.out.println("6. Sort to name and salary");
            System.out.println("7. Input Staff");
            System.out.println("8. Write File");
            System.out.println("9. Display 3 Staff enough age to retire and highest salary");
            System.out.println("10. Exit");
            int choice = RegexMenu.inputChoice();

            switch (choice) {
                case 1:
                    service.readFile(); break;
                case 2:
                    service.display(); break;
                case 3:
                    service.remove(); break;
                case 4:
                    service.update(); break;
                case 5:
                    service.search(); break;
                case 6:
                    service.sort(); break;
                case 7:
                    service.inputStaff(); break;
                case 8:
                    service.writeFile(); break;
                case 9:
                    service.displayThreeStaff(); break;
                case 10:
                    System.exit(10);
                default:
                    System.out.println("Invalid!");

            }
        }
    }
}
