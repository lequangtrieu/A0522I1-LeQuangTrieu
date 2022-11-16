package ss13_Finding.Th1_Calculate_Complexity;

import java.util.Scanner;

public class CalculateComplexity {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter the string: ");
        String s = input.nextLine();

        int[] arr = new int[255];
        for (int i = 0; i < s.length(); i++) {
            int ascii = (int) s.charAt(i);
            arr[ascii] += 1;
        }

        int max = 0;
        char character = (char) 255;
        for (int i = 0; i < 255; i++) {
            if (arr[i] > max) {
                max = arr[i];
                character = (char) i;
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }
}
