package ss20_code_fpt.Lab5.Controller;

import ss20_code_fpt.Lab5.Service.ISchool;
import ss20_code_fpt.Lab5.Service.School;
import ss20_code_fpt.Lab5.Utils.RegexMenu;

import java.util.Scanner;

public class SearchStudent {

    private static final ISchool service = new School();
    private static final Scanner input = new Scanner(System.in);

    public static void searchStudent() {
        while (true) {
            System.out.println("1. Find by id");
            System.out.println("2. Find by name");
            System.out.println("3. Return main menu");
            int choice = RegexMenu.inputChoice();

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
