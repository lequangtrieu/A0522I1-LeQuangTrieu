package ss20_code_fpt.Week_1.Lab1A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintDivisor {
    private static final Scanner input = new Scanner(System.in);
    private static List<Integer> divisor(int n) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr.add(i);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("enter n:");
        int n = Integer.parseInt(input.nextLine());
        System.out.println(divisor(n));
    }
}
