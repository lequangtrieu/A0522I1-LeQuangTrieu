package final_exam.Controller;

import final_exam.Service.MainAccountService;
import final_exam.Service.MainAccountServiceImpl;
import final_exam.Service.SaveAccountService;
import final_exam.Service.SaveAccountServiceImpl;

import java.util.Scanner;

public class ViewListBanking {
    private static SaveAccountService saveAccountService = new SaveAccountServiceImpl();
    private static MainAccountService mainAccountService = new MainAccountServiceImpl();
    private static Scanner input = new Scanner(System.in);

    public static void viewBanking() {
        while (true) {
            System.out.println("Please choose the kind of account you wanna view list: ");
            System.out.println("1. SaveAccount");
            System.out.println("2. MainAccount");
            System.out.println("3. Return main menu");
            System.out.println("Choose number: ");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    saveAccountService.viewList(); break;
                case 2:
                    mainAccountService.viewList(); break;
                case 3: return;
                default:
                    System.out.println("Your wrong!, please input again!");
            }
        }
    }
}
