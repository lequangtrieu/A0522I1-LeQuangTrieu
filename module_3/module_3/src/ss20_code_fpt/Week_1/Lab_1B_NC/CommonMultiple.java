package ss20_code_fpt.Week_1.Lab_1B_NC;

import java.util.Scanner;

public class CommonMultiple {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter a:");
        int a = Integer.parseInt(input.nextLine());
        System.out.println("enter b:");
        int b = Integer.parseInt(input.nextLine());
        System.out.println("enter x:");
        int x = Integer.parseInt(input.nextLine());
        System.out.println("enter y:");
        int y = Integer.parseInt(input.nextLine());

        int temp = x * y;

        int result;

        int level = 1;

        while (true) {
            result = temp * level;
            if (result > b) {
                break;
            }
            if (result > a && result < b) {
                System.out.println(result);
            }
            level++;
        }
    }
}
