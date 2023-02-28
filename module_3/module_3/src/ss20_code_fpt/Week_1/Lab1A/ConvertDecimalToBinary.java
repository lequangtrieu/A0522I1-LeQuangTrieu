package ss20_code_fpt.Week_1.Lab1A;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {
    private static final Scanner input = new Scanner(System.in);
    private static Stack<Integer> stack = new Stack<>();

    private static void convert(int n) {
        for (int i = 0; i < 8; i++) {
            int num = n % 2;
            stack.push(num);
            n /= 2;
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        System.out.println("enter n:");
        int n = Integer.parseInt(input.nextLine());
        convert(n);
    }

}
