package ss20_code_fpt.Lab5.Controller;

import ss20_code_fpt.Lab5.Service.ISchool;
import ss20_code_fpt.Lab5.Service.School;
import ss20_code_fpt.Lab5.Utils.RegexMenu;

import java.util.Scanner;

public class SchoolManagement {
    private static final ISchool schoolService = new School();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("SCHOOL MANAGEMENT SYSTEM");
            System.out.println("---------------------------------");
            System.out.println("1. List all students");
            System.out.println("2. Search student");
            System.out.println("3. Add new student");
            System.out.println("4. Sorting display");
            System.out.println("5. Exit");
            int choice = RegexMenu.inputChoice();

            switch (choice) {
                case 1:
                    schoolService.listAllStudent();
                    break;
                case 2:
                    SearchStudent.searchStudent();
                    break;
                case 3:
                    schoolService.addStudent();
                    break;
                case 4:
                    SortStudent.sortStudent();
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
