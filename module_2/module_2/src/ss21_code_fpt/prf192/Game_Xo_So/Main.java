package ss21_code_fpt.prf192.Game_Xo_So;

import java.nio.file.LinkPermission;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random random = new Random(10000000);
    static Scanner input = new Scanner(System.in);
    public static void Check(int level) {
        int r = 0;
        int x;
        int check = 1000000;
        switch (level) {
            case 1: r = random.nextInt(check) % 10; break;
            case 2: r = random.nextInt(check) % 100; break;
            case 3: r = random.nextInt(check) % 1000; break;
            case 4: r = random.nextInt(check) % 10000; break;
            case 5: r = random.nextInt(check) % 1000000; break;
            default:
                System.out.println("no choice");
        }
        System.out.println("enter your number: ");
        x = input.nextInt();
        System.out.println("your number is: " + x + "\nlotto is: " + r);

        if(x == r) {
            System.out.println("Congratulation");
        } else {
            System.out.println("Good luck");
        }
    }
    public static void main(String[] args) {
        System.out.println("enter the level: ");
        int n = input.nextInt();
        Check(n);
    }
}
