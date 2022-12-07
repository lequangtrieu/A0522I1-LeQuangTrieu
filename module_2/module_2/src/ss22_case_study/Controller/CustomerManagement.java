package ss22_case_study.Controller;

import ss22_case_study.Services.CustomerService;
import ss22_case_study.Services.Implement.CustomerServiceImp;

import java.util.Scanner;

public class CustomerManagement {
    private static Scanner input = new Scanner(System.in);
    private static CustomerService customerService = new CustomerServiceImp();
    public static void manageCustomer() {
        while (true) {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    customerService.display(); break;
                case 2:
                    customerService.add(); break;
                case 3:
                    customerService.editInfo(); break;
                case 4:
                    return;
            }
        }

    }
}
