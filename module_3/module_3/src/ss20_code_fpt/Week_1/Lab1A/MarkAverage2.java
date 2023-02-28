package ss20_code_fpt.Week_1.Lab1A;

import java.util.Scanner;

public class MarkAverage2 {
    private static final Scanner input = new Scanner(System.in);
    private static double markAverage(double[] mark, int[] level) {
        double sum = 0;
        int temp = 0;
        for (int i = 0; i < mark.length; i++) {
            sum += (mark[i] * level[i]);
            temp += level[i];
        }
        double result = sum / temp;
        return result;
    }

    public static void main(String[] args) {
        double[] mark = {6, 6, 6};
        int[] level = {1, 2, 3};
        System.out.println(markAverage(mark, level));
    }
}
