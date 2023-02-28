package ss20_code_fpt.Week_1.Lab1A;

import java.util.Scanner;

public class QuadraticEquation {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("SOLVING QUADRATIC EQUATION Ax^2 + Bx + C = 0");
        System.out.println("enter a: ");
        double a = input.nextDouble();
        System.out.println("enter b: ");
        double b = input.nextDouble();
        System.out.println("enter c: ");
        double c = input.nextDouble();

        System.out.println("The delta is: ");
        double delta = Math.pow(b, 2) - (4 * a * c);
        double root1 = (-b + Math.pow(b*b - (4 * a * c), 0.5)) / (2 * a);
        double root2 = (-b - Math.pow(b*b - (4 * a * c), 0.5)) / (2 * a);
        double root3 = -b / (2 * a);

        if(delta > 0) {
            System.out.println("the result of the equation is: x1 = " + root1 + ", x2 = " + root2);
        } else if (delta == 0) {
            System.out.println("the equation have only one result is: x1 = x2 = " + root3);
        } else {
            System.out.println("the equation has no result");
        }
    }
}
