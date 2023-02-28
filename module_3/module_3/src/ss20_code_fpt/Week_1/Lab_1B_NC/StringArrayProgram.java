package ss20_code_fpt.Week_1.Lab_1B_NC;

import java.util.Arrays;
import java.util.Scanner;


public class StringArrayProgram {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("== STRING-ARRAY PROGRAM ==");
        String s = "5, 2, 8, 26, 3, 452, 32, 7";
        s = s.trim().replaceAll("\\s+", "");
        System.out.println(s);
        System.out.println("array before sorting:");
        String[] arr = s.split(",");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (Integer.parseInt(arr[i]) < Integer.parseInt(arr[j])) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("\nafter sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
