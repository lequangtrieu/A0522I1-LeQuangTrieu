package ss21_code_fpt.pt1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList list = new ArrayList<>();

        while (true) {
            System.out.println("1 Input It Student");
            System.out.println("2 Input Binz Student");
            System.out.println("3 Display");
            System.out.println("4. Exit");
            System.out.println("enter your choice:");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("name");
                    String name = input.nextLine();
                    System.out.println("address");
                    String address = input.nextLine();
                    System.out.println("age:");
                    int age = Integer.parseInt(input.nextLine());
                    System.out.println("java");
                    double java = Double.parseDouble(input.nextLine());
                    System.out.println("css");
                    double css = Double.parseDouble(input.nextLine());

                    ItStudent itStudent = new ItStudent(name, address, age, java, css);
                    list.add(itStudent);
                    break;
                case 2:
                    System.out.println("name");
                    String name2 = input.nextLine();
                    System.out.println("address");
                    String address2 = input.nextLine();
                    System.out.println("age:");
                    int age2 = Integer.parseInt(input.nextLine());
                    System.out.println("account");
                    double account = Double.parseDouble(input.nextLine());
                    System.out.println("marketing");
                    double marketing = Double.parseDouble(input.nextLine());

                    BinzStudenyt binzStudenyt = new BinzStudenyt(name2, address2, age2, account, marketing);
                    list.add(binzStudenyt);
                    break;
                case 3:
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }
                    break;
                case 4:
                    System.exit(4);
                    break;
            }
        }
    }
}



