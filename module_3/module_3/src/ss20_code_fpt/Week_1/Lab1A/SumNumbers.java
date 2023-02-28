package ss20_code_fpt.Week_1.Lab1A;

import java.util.Scanner;

public class SumNumbers {
    private static final Scanner input = new Scanner(System.in);
    private static int sum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("enter n: ");
        int n = Integer.parseInt(input.nextLine());
        System.out.println(sum(n));
    }
}
