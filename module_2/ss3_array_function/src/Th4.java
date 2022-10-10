import java.util.Scanner;

public class Th4 {
    public static double cToF(double c) {
        double f = (9.0 / 5) * c + 32;
        return f;
    }
    public static double fToC(double f) {
        double c = (5.0 / 9) * (f -32);
        return c;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double f;
        double c;
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu: ");
            System.out.println("1. convert C to F");
            System.out.println("2. convert F to C: ");
            System.out.println("0. Exit");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("enter the temperature C:  ");
                    c = input.nextDouble();
                    System.out.println("the temperature after convert from C to F is: " + cToF(c));
                    break;
                case 2:
                    System.out.println("enter the temperature F: ");
                    f = input.nextDouble();
                    System.out.println("the temperature after convert from F to C is: " + fToC(f));
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("invalid value");
            }
        }
    }
}
