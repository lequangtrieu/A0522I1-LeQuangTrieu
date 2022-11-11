package ss12_Collection.Th1_TestStudent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ListStudent listStudent = new ListStudent();

        while (true) {
            System.out.println("\nMenu: ");
            System.out.println("1. add: ");
            System.out.println("2. print: ");
            System.out.println("3. check empty: ");
            System.out.println("4. amount of students: ");
            System.out.println("5. making empty: ");
            System.out.println("6. check exist : ");
            System.out.println("7. remove: ");
            System.out.println("8. search all: ");
            System.out.println("9. sort ascending: ");
            System.out.println("10. exit: ");
            System.out.println("enter your choice: ");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("id: "); String id = input.nextLine();
                    System.out.println("name: "); String name = input.nextLine();
                    System.out.println("age: "); int age = Integer.parseInt(input.nextLine());
                    System.out.println("grade: "); float grade = Float.parseFloat(input.nextLine());
                    Student student = new Student(id, name, age, grade);
                    listStudent.addStudent(student);
                    break;
                case 2:
                    listStudent.printStudent();
                case 3:

                case 4:

                case 5:

                case 6:

                case 7:

                case 8:
                    System.exit(8);

            }
        }
    }
}
