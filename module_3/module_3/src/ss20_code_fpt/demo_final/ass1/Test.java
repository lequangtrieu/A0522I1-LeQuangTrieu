package ss20_code_fpt.demo_final.ass1;

import java.util.Scanner;

public class Test {
    private static final Scanner input = new Scanner(System.in);
    private static final SavingAccount savingAccount = new SavingAccount("A1", 500);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Test savingWithdraw()");
            System.out.println("2. Test savingDeposit()");
            System.out.println("Enter the option (1 or 2): ");
            int choice = Integer.parseInt(input.nextLine());
            int money;
            switch (choice) {
                case 1:
                    System.out.println("enter the money");
                    money = Integer.parseInt(input.nextLine());
                    System.out.println(savingAccount.savingWithDraw(money));
                    break;
                case 2:
                    System.out.println("enter the money");
                    money = Integer.parseInt(input.nextLine());
                    System.out.println(savingAccount.savingDeposit(money));
                    break;
                default:
                    System.out.println("invalid");
            }
        }


    }
}
