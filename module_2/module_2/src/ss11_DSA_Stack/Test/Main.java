package ss11_DSA_Stack.Test;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();
        System.out.println("Nhap vao chuoi: ");
        String s = input.nextLine();

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i) + "");
        }
        System.out.println("Chuoi dao nguoc la: ");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(stack.pop());
        }

        Stack<Integer> stackConvert = new Stack<Integer>();
        System.out.println("\nNhập một số nguyên  dương từ bàn phím: ");
        int x = input.nextInt();
        while (x > 0) {
            int result = x % 2;
            stackConvert.push(result);
            x = x / 2;
        }
        int n = stackConvert.size();
        System.out.println("Số nhị phân là: ");
        for (int i = 0; i < n; i++) {
            System.out.println(stackConvert.pop());
        }

    }
}
