package ss20_code_fpt.Week_1.Lab1A;

import java.util.Scanner;

public class ConvertBinaryToDecimal {
    private static final Scanner input = new Scanner(System.in);
    private static int convert(int binaryNum) {
        int result = 0;
        int level = 0;
        while (binaryNum != 0) {
            int temp = binaryNum % 10;
            result += temp * Math.pow(2, level);
            binaryNum = binaryNum / 10;
            level++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(convert(1011));
    }
}
