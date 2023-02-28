package ss20_code_fpt.Week_1.Lab1A;

import java.util.Scanner;

public class FirstDegreeEquation {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(" SOLVING FIRST EQUATION Ax + B = 0 ");
        System.out.println("enter a: ");
        double a = Double.parseDouble(input.nextLine());
        System.out.println("enter b:");
        double b = Double.parseDouble(input.nextLine());

        if (a != 0) {
            System.out.println("the equation have only one root is: " +(-b/a));
        } else {
            if (b == 0) {
                System.out.println("the equation have infinitely many root: ");
            } else {
                System.out.println("no root");
            }
        }
    }
}
