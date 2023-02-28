package ss20_code_fpt.Week_1.Lab_1B_NC;

import java.util.Scanner;

public class CountButtonsMotor {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter the numbers:");
        int n = Integer.parseInt(input.nextLine());
        int sum = 0;

        while (true) {
            if (n == 0) {
                break;
            }
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum % 10);
    }
}
