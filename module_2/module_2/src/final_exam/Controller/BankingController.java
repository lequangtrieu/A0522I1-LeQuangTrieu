package final_exam.Controller;

import final_exam.Service.MainAccountService;
import final_exam.Service.MainAccountServiceImpl;
import final_exam.Service.SaveAccountService;
import final_exam.Service.SaveAccountServiceImpl;

import java.util.Scanner;

public class BankingController {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("-- MANAGEMENT BAKING ACCOUNT PROGRAMING --");
            System.out.println("Choose number to continue:");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. View list baking account");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            System.out.println("Choose number: ");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    AddingBanking.addingBanking(); break;
                case 2:
                    RemoveBanking.removeBanking(); break;
                case 3:
                    ViewListBanking.viewBanking(); break;
                case 4:
                case 5:
                    System.exit(5);
                    break;
                default:
                    System.out.println("Your wrong!, please input again!");
            }
        }
    }
}
