import java.util.Scanner;

public class Th2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the money");
        double money = input.nextDouble();
        System.out.println("enter the month");
        int month = input.nextInt();
        System.out.println("enter the rate of year");
        double rate = input.nextDouble();
        double result = 0;
        for(int i = 0; i < month; i++) {
            result += money * ((rate/100)/12 * month);
        }
        System.out.println("the result is: " + result);
    }
}
