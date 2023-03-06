package ss20_code_fpt.Assignment.Utils;

import java.util.Scanner;

public class RegexMenu {
    private static final Scanner input = new Scanner(System.in);
    public static Integer inputChoice() {
        while (true) {
            try {
                System.out.println("enter your choice:");
                return Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Enter a number !!!");
            }
        }
    }
}
