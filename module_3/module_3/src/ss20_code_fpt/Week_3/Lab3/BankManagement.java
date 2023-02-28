package ss20_code_fpt.Week_3.Lab3;

import java.time.LocalDate;
import java.util.Scanner;

public class BankManagement {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("Calculate actual cost: ");
            System.out.println("1. North Bank");
            System.out.println("2. Center Bank");
            System.out.println("3. Exit");
            System.out.println("enter your choice");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    NorthBank northBank = new NorthBank(1, "HaNoi", LocalDate.parse("2020-03-15"), "HaNoi", 1, 1);
                    System.out.println("Actual cost is:");
                    System.out.println(northBank.estimateCost());
                    break;
                case 2:
                    CenterBank centerBank = new CenterBank(2, "DaNang", LocalDate.parse("2020-03-15"), "Danang", 1, 1, 1);
                    System.out.println("Actual cost is:");
                    System.out.println(centerBank.actualCost());
                    break;
                case 3:
                    System.exit(3);
                default:
                    System.out.println("invalid");
            }
        }
    }
}
