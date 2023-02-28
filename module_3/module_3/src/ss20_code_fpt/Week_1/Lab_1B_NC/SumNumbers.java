package ss20_code_fpt.Week_1.Lab_1B_NC;

import java.util.Scanner;

public class SumNumbers {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("== TOTAL PROGRAM ==");
        double e;

        do {
            System.out.println("enter e:");
            e = Double.parseDouble(input.nextLine());
            if (e > 1 || e < 0) {
                System.out.println("Please enter a double value between 0 and 1");
            }
        } while(e > 1 || e < 0);

        double sum = 1;
        int n = 2;

        while (true) {
            if ((double) 1/n < e) {
                break;
            }
            if (n % 2 == 0) {
                sum -= (double) 1/n;
            } else {
                sum += (double) 1/n;
            }
            n++;
        }


//        System.out.println((double) 1/n);
//        for (int i = 2; i < 5; i++) {
//            if (i % 2 == 0) {
//                sum -= (double) 1/i;
//            } else {
//                sum += (double) 1/i;
//            }
//        }

        System.out.println(sum);
    }
}
