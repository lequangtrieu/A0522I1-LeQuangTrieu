import java.util.Scanner;

public class Bt1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. rectangle");
            System.out.println("2. square triangle");
            System.out.println("3. isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("enter the choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    for(int i = 1; i <= 3; i++) {
                        System.out.println("********");
                    }
                    break;
                case 2:
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 3:
                    for(int i = 7; i >= 1; i--) {
                        for(int j = 1; j <= i; j++) {
                            System.out.println("*");
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
