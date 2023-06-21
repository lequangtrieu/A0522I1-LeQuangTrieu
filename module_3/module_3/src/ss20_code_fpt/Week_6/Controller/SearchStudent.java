package ss20_code_fpt.Week_6.Controller;

import ss20_code_fpt.Week_6.Service.IService;
import ss20_code_fpt.Week_6.Service.Service;

import java.util.Scanner;

public class SearchStudent {

    private static final IService service = new Service();
    private static final Scanner input = new Scanner(System.in);

    public static void searchStudent() {
        while (true) {
            System.out.println("1. Find by id");
            System.out.println("2. Find by name");
            System.out.println("3. Return main menu");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("enter the id you wanna finding:");
                    String id = input.nextLine();
                    service.findById(id);
                    break;
                case 2:
                    System.out.println("enter the name you wanna finding:");
                    String name = input.nextLine();
                    service.findByName(name);
                    break;
                case 3:
                     return;
            }
        }
    }
}
