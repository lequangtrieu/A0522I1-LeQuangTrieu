package ss20_code_fpt.Week_1.Lab1A;

import java.util.Scanner;

public class Primes {
    private static final Scanner input = new Scanner(System.in);
    private static boolean check(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("enter a:");
        int a = Integer.parseInt(input.nextLine());
        System.out.println("enter b:");
        int b = Integer.parseInt(input.nextLine());

        for (int i = a; i < b; i++) {
            if (check(i)) {
                System.out.println(i);
            }
        }
    }
}
