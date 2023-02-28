package ss20_code_fpt.Week_1.Lab1A;

import java.util.Scanner;

public class PerfectSquareNumber {
    private static final Scanner input = new Scanner(System.in);
    private static boolean check(int x) {
        double num = Math.sqrt(x);
        return ((num - Math.floor(num)) == 0);
    }

    public static void main(String[] args) {
        System.out.println("enter m:");
        int m = Integer.parseInt(input.nextLine());
        System.out.println("enter n:");
        int n = Integer.parseInt(input.nextLine());

        for (int i = m; i < n; i++) {
            if (check(i)) {
                System.out.println(i);
            }
        }
    }
}
