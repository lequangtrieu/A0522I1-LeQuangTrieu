import java.util.Scanner;

public class th4 {
    public static void main(String[] args) {
        System.out.println("check leap year");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("leap year");
        } else {
            System.out.println("no leap year");
        }
    }
}
