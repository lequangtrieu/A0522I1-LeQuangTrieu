package ss20_code_fpt.Week_1.Lab1A;

import java.util.Scanner;

public class PerfectNumber {
    private static final Scanner input = new Scanner(System.in);
    private static void printPerfectNum(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    sum += i / j;
                }
            }
            if (i == sum) {
                System.out.println(i);
            }
            sum = 0;
        }
    }
    public static void main(String[] args) {
        System.out.println("enter n:");
        int n = Integer.parseInt(input.nextLine());
        printPerfectNum(n);
    }
}
