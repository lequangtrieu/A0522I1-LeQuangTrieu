package ss21_code_fpt.menu_csi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 3) {
            System.out.println("Menu:");
            System.out.println("1. Quadratic equation: ");
            System.out.println("2. Bank deposit problem: ");
            System.out.println("3. Exit");
            System.out.println("\nEnter your choice:");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Quadratic equation (please enter a, b, c): ");
                    System.out.println("enter a: ");
                    double a = input.nextDouble();
                    System.out.println("enter b: ");
                    double b = input.nextDouble();
                    System.out.println("enter c: ");
                    double c = input.nextDouble();

                    Quadratic_equation quadratic_equation = new Quadratic_equation(a, b, c);
                    System.out.println("The delta of the quadratic equation is: " + quadratic_equation.getDelta());
                    double delta = quadratic_equation.getDelta();
                    if (delta > 0) {
                        System.out.println("the roots of the quadratic equation is: x1 = " + quadratic_equation.getRoot1() + ", x2 = " + quadratic_equation.getRoot2());
                    } else if (delta == 0) {
                        System.out.println("the quadratic equation have only one root is: x1 = x2 = " + quadratic_equation.getRoot3());
                    } else {
                        System.out.println("the quadratic equation has no root");
                    }
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("Bank deposit problem:");
                    int money;
                    do {
                        System.out.println("enter the money you wanna deposit:");
                        money = input.nextInt();
                        if (money < 0) {
                            System.out.println("please enter the positive number");
                        }
                    } while (money < 0);

                    int month;
                    do {
                        System.out.println("enter the month of deposit");
                        month = input.nextInt();
                        if (month < 0) {
                            System.out.println("please enter the positive number");
                        }
                    } while (month < 0);

                    double rate;
                    do {
                        System.out.println("enter the deposit interest rate");
                        rate = input.nextDouble();
                        if (rate < 0 || rate > 0.1) {
                            System.out.println("please enter the positive number and less than or equal to 0.1");
                        }
                    } while (rate < 0 || rate > 0.1);

                    double amount = 0;
                    amount = money + (money * rate * month);
                    System.out.println("Total amount received is: " + amount + "\n\n");
                    break;
                case 3:
                    System.exit(3);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
