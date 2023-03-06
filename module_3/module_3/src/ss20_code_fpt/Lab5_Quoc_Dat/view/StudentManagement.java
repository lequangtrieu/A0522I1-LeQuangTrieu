package ss20_code_fpt.Lab5_Quoc_Dat.view;

import ss20_code_fpt.Lab5_Quoc_Dat.controller.ISchool;
import ss20_code_fpt.Lab5_Quoc_Dat.controller.School;

import java.util.Scanner;

public class StudentManagement {
    private static final ISchool school = new School();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Display all students");
            System.out.println("2. Search student");
            System.out.println("3. Add new student");
            System.out.println("4. Sorting display");
            System.out.println("5. Exit");
            System.out.println("enter your choice:");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    school.display();
                    break;
                case 2:
                    Search.search();
                    break;
                case 3:
                    school.add();
                    break;
                case 4:
                    Sort.sortStudent();
                    break;
                case 5:
                    System.exit(5);
                    break;
                default:
                    System.out.println("Invalid");
            }

        }
    }
}
