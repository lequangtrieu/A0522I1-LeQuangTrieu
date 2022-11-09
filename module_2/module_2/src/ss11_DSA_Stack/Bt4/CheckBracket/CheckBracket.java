package ss11_DSA_Stack.Bt4.CheckBracket;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = input.nextLine();
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i) + "");
            }

            if (str.charAt(i) == ')') {
                if (stack.size() == 0) {
                    flag = false;
                    System.out.println("false");
                    break;
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.size() == 0 && flag) {
            System.out.println("true");
        }
        if (stack.size() > 0) {
            System.out.println("false");
        }
    }

}
