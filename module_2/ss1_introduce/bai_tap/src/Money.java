import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd = 23800;

        System.out.println("enter the money of usd: ");
        double usd = scanner.nextDouble();
        double result = usd * vnd;
        System.out.println("the money of vietnam after convert from usd is: " + result);

    }
}
