package ss11_DSA_Stack.Bt3_Palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();
//        Queue<String> queue = new LinkedList<String>();

        String str = "Able was I ere I saw Elba";

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i)+ "");
        }
//        System.out.println("\n");
        int n = stack.size();
        String str2 = "";
        for (int i = 0; i < n; i++) {
            str2 += stack.pop();
        }
        System.out.println(str);
        System.out.println(str2);

        if (str.toLowerCase().equals(str2.toLowerCase())) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

//        System.out.println(str.toLowerCase());
//        System.out.println(str2.toLowerCase());
    }
}
