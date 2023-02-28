package ss20_code_fpt.Week_1.Lab1A;

import java.util.Scanner;

public class ConvertCharToMark {
    private static final Scanner input = new Scanner(System.in);
    private static int printMark(char a) {
        if (a == 'A') {
            return 4;
        } else if (a == 'B') {
            return 3;
        } else if (a == 'C') {
            return 2;
        } else if (a == 'D') {
            return 1;
        } else if (a == 'F') {
            return 0;
        } else return -1;
    }

    public static void main(String[] args) {
        System.out.println("enter a character:");
        char c = input.nextLine().charAt(0);
        System.out.println(printMark(c));
    }
}
