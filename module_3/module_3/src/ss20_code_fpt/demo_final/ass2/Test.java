package ss20_code_fpt.demo_final.ass2;

import java.util.Scanner;

public class Test {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter owner: ");
        String owner = input.nextLine();
        System.out.println("enter price: ");
        int price = Integer.parseInt(input.nextLine());
        System.out.println("enter color: ");
        int color = Integer.parseInt(input.nextLine());
        SpeeCala speeCala = new SpeeCala(owner, price, color);

        System.out.println();
        System.out.println("1. Test toString()");
        System.out.println("2. Test setData()");
        System.out.println("3. Test getValue()");
        System.out.println("Enter TC(1, 2, 3): ");
        int choice = Integer.parseInt(input.nextLine());

        switch (choice) {
            case 1:
                System.out.println(speeCala);
                break;
            case 2:
                speeCala.setData();
                break;
            case 3:
                System.out.println(speeCala.getValue());
                break;
            default:
                System.out.println("invalid");
        }
    }
}
