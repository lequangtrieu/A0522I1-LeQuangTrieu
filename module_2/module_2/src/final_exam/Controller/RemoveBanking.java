package final_exam.Controller;

import final_exam.Service.MainAccountService;
import final_exam.Service.MainAccountServiceImpl;
import final_exam.Service.SaveAccountService;
import final_exam.Service.SaveAccountServiceImpl;

import java.util.Scanner;

public class RemoveBanking {
    private static SaveAccountService saveAccountService = new SaveAccountServiceImpl();
    private static MainAccountService mainAccountService = new MainAccountServiceImpl();
    private static Scanner input = new Scanner(System.in);

    public static void removeBanking() {
        while (true) {
            System.out.println("Please choose the kind of account you wanna remove: ");
            System.out.println("1. SaveAccount");
            System.out.println("2. MainAccount");
            System.out.println("3. Return main menu");
            System.out.println("Choose number: ");
            int choice_add = Integer.parseInt(input.nextLine());
            switch (choice_add) {
                case 1:
                    saveAccountService.remove(); break;
                case 2:
                    mainAccountService.remove(); break;
                case 3: return;
                default:
                    System.out.println("Your wrong!, please input again!");
            }
        }
    }
}
