package ss20_code_fpt.Week_1.Lab1A;

import java.util.Scanner;

public class SumNumbers2 {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter a:");
        int a = Integer.parseInt(input.nextLine());
        System.out.println("enter e:");
        double e = Double.parseDouble(input.nextLine());

        double sum = 1;

//        for (int i = 1; i < 10; i++) {
//            if (Math.pow(a, -i) <= e) {
//                break;
//            }
//            sum += Math.pow(a, -i);
//        }
//        System.out.println(sum);

        int level = 1;
        while (true) {
            if (Math.pow(a, -level) <= e) {
                break;
            }
            sum += Math.pow(a, -level);
            level++;
        }
        System.out.println(sum);
    }
}
