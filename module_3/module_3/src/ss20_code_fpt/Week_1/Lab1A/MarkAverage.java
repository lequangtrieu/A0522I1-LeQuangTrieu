package ss20_code_fpt.Week_1.Lab1A;

import java.util.Scanner;

public class MarkAverage {
    private static final Scanner input = new Scanner(System.in);
    private static double markAverage(double[] arr) {
        double sum = 0;;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > 10 || arr[i] < 0) {
                return -1;
            }
        }
        double result = sum / arr.length;
        return result;
    }

    public static void main(String[] args) {
        double[] arr = {6, 7.5, 6.3, 10};
        System.out.println("array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\n mark average is: ");
        System.out.println(markAverage(arr));
    }
}
