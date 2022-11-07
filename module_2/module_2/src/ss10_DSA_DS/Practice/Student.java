package ss10_DSA_DS.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        List arr = new ArrayList<>();

        int choice = -1;
        while(choice != 0) {
            System.out.println("Menu: ");
            System.out.println("1. add: ");
            System.out.println("2. remove: ");
            System.out.println("3. search: ");
            System.out.println("4. print: ");
            System.out.println("0. exit: ");
            System.out.println("enter your choice: ");
            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("enter the name you wanna add to the array: ");
                    String name_add = input.nextLine();
                    arr.add(name_add);
                    break;
                case 2:
                    System.out.println("enter the name you wanna remove into the array: ");
                    String name_remove = input.nextLine();
                    if (arr.contains(name_remove)) {
                        arr.remove(name_remove);
                    } else {
                        System.out.println("the name is invalid");
                    }
                    break;
                case 3:
                    System.out.println("enter the name you wanna find: ");
                    String name_find = input.nextLine();
                    if (arr.contains(name_find)) {
                        System.out.println("the name you wanna find is in the position: " + arr.indexOf(name_find));
                    } else {
                        System.out.println("the name is invalid");
                    }
                    break;
                case 4:
                    System.out.println("the array is: ");
                    for(int i = 0; i < arr.size(); i++) {
                        System.out.print(arr.get(i) + "\t");
                    }

                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
