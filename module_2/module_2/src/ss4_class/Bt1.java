package ss4_class;

import java.util.Scanner;

public class Bt1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a: ");
        double a = input.nextDouble();
        System.out.println("enter b: ");
        double b = input.nextDouble();
        System.out.println("enter c: ");
        double c = input.nextDouble();

        Ptb2 ptb2 = new Ptb2(a, b, c);
        System.out.println("the delta is: " + ptb2.getDelta());
        double delta = ptb2.getDelta();
        if(delta > 0) {
            System.out.println("the result of the equation is: x1 = " + ptb2.getRoot1() + ", x2 = " + ptb2.getRoot2());
        } else if (delta == 0) {
            System.out.println("the equation have only one result is: x1 = x2 = " + ptb2.getRoot3());
        } else {
            System.out.println("the equation has no result");
        }
    }
}
