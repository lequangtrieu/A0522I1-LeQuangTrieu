package ss20_code_fpt.Week_1.Lab1A;

import java.util.Scanner;

public class ConvertMarkToChar {
    private static final Scanner input = new Scanner(System.in);
    private static String convert(double n) {
        if (n >= 8.5 && n <= 10) {
            return "A";
        } else if (n >= 7 && n <= 8.4) {
            return "B";
        } else if (n >= 5.5 && n <= 6.9) {
            return "C";
        } else if (n >= 4 && n <= 5.4) {
            return "D";
        } else if (n >= 0 && n <= 3.9) {
            return "F";
        } else return "invalid";
    }

    public static void main(String[] args) {
        System.out.println("enter n:");
        double n = Double.parseDouble(input.nextLine());
        System.out.println(convert(n));
    }
}
