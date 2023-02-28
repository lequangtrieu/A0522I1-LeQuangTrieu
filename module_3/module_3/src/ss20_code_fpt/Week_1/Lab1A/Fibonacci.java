package ss20_code_fpt.Week_1.Lab1A;

import java.util.Scanner;

public class Fibonacci {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter n:");
        int n = Integer.parseInt(input.nextLine());

        int n1 = 0;
        int n2 = 1;
        int temp = 0;
        while (n1 < n) {
            System.out.println(n1);
            temp = n1 + n2;
            n1 = n2;
            n2 = temp;
        }
    }
}
