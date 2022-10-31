package Test;

import java.util.Scanner;

public class Student {
    public static Scanner input = new Scanner(System.in);

    public static void add(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                System.out.println("enter the name you wanna add: ");
                array[i] = input.next();
                System.out.println("adding successfully!");
                break;
            }
        }
    }

    public static void remove(String[] array) {
        int index = 0;
        System.out.println("enter the name you wanna remove: ");
        String name_remove = input.next();
        for (int i = 0; i < array.length; i++) {
            if (name_remove == array[i]) {
                index = i;
                break;
            }
        }

        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i - 1] = null;
                break;
            }
        }
    }

    public static void search(String[] array) {
        System.out.println("enter the name you wanna find");
        String name_find = input.next();
        for (int i = 0; i < array.length; i++) {
            if (name_find == array[i]) {
                System.out.println("the name you wanna find is in the position: " + i);
                break;
            } else {
                System.out.println("no name");
            }
        }
    }

    public static void display(String[] array) {
        System.out.println("the array is: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                break;
            }
            System.out.print(array[i] + "\t");

        }
    }


    public static void main(String[] args) {

        String name;
        int choice = -1;

        String[] arr = new String[100];


        while (choice != 0) {
            System.out.println("\nMenu: ");
            System.out.println("1. Add:  ");
            System.out.println("2. Remove:  ");
            System.out.println("3. Search:  ");
            System.out.println("4. Print:  ");
            System.out.println("0. Exit ");
            System.out.println("Enter your choice:  ");
            choice = input.nextInt();


            switch (choice) {
                case 1:
                    Student.add(arr);
                    break;
                case 2:
                    Student.remove(arr);
                    break;
                case 3:
                    Student.search(arr);
                    break;
                case 4:
                    Student.display(arr);
                    break;
                case 0:
                    System.exit(0);
            }
        }

    }
}
