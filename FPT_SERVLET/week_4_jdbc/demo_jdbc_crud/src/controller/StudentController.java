package controller;

import model.Student;
import service.StudentService;
import service.StudentServiceImpl;

import java.util.Scanner;

public class StudentController {
    private static final Scanner input = new Scanner(System.in);

    private static final StudentService studentService = new StudentServiceImpl();
    public static void main(String[] args) {
        while (true) {
            System.out.println("STUDENT MANAGEMENT");
            System.out.println("1. getList");
            System.out.println("2. add");
            System.out.println("3. update");
            System.out.println("4. delete");
            System.out.println("5. exit");
            System.out.println("enter choice:");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    studentService.displayList();
                    break;
                case 2:
                    studentService.add();
                    break;
                case 3:
                    studentService.update();
                    break;
                case 4:
                    studentService.deleteById();
                    break;
                case 5:
                    return;
            }
        }
    }

}
