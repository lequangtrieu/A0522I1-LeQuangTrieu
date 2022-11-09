package ss11_DSA_Stack.Bt2_Convert;

import java.util.Scanner;
import java.util.Stack;

public class CovertNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("enter the number: ");
        int num = Integer.parseInt(input.nextLine());

        while (num > 0) {
            System.out.println(stack.push(num % 2));
            num = num / 2;
        }

        System.out.println("the binary is: ");
        int n = stack.size();
        for (int i = 0; i < n; i++) {
            System.out.print(stack.pop()+ "\t");
        }

    }
}
