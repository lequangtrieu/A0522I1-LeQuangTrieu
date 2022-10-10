
import java.util.Scanner;
public class Th1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the num to check primes");
        int num = scanner.nextInt();
        boolean flag = true;
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                flag = false;
            }
        }
        if(flag && num >= 2) {
            System.out.println(num + " is a prime");
        } else {
            System.out.println(num + " is not a prime");
        }
    }
}
