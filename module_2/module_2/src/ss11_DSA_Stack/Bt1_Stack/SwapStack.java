package ss11_DSA_Stack.Bt1_Stack;


import java.util.Scanner;
import java.util.Stack;

public class SwapStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("before swap: ");
        System.out.print(stack.push(1) + "\t");
        System.out.print(stack.push(2) + "\t");
        System.out.print(stack.push(3) + "\t");
        System.out.print(stack.push(4) + "\t");
        System.out.print(stack.push(5) + "\t");

        System.out.println("\nafter swap: ");
        int n = stack.size();
        for (int i = 0; i < n; i++) {
            System.out.print(stack.pop() + "\t");
        }

        System.out.println("\n");

        Stack<String> wStack = new Stack<String>();
        System.out.println("Nhap vao chuoi: ");
        String s = input.nextLine();

        for (int i = 0; i < s.length(); i++) {
            wStack.push(s.charAt(i) + "");
        }
        System.out.println("Chuoi dao nguoc la: ");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(wStack.pop());
        }

        System.out.println("\n");
        Stack<Integer> stackConvert = new Stack<Integer>();
        System.out.println("\nNhập một số nguyên  dương từ bàn phím: ");
        int x = input.nextInt();
        while (x > 0) {
            int result = x % 2;
            stackConvert.push(result);
            x = x / 2;
        }
        int m = stackConvert.size();
        System.out.println("Số nhị phân là: ");
        for (int i = 0; i < m; i++) {
            System.out.println(stackConvert.pop());
        }




    }
}
