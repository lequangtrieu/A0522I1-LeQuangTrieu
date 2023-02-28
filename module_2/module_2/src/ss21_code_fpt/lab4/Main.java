package ss21_code_fpt.lab4;

import ss22_case_study.Models.Person.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MainStaff mainStaff = new MainStaff();
        Scanner input = new Scanner(System.in);

        ArrayList list = new ArrayList<>();

        while (true) {
            System.out.println("1. ");
            System.out.println("2");
            System.out.println("3. Exit");

            int choice = Integer.parseInt(input.nextLine());


            switch (choice) {
                case 1:
                    System.out.println("id");
                    int id = Integer.parseInt(input.nextLine());
                    System.out.println("name");
                    String name = input.nextLine();
                    System.out.println("birthday");
                    String birthday = input.nextLine();
                    System.out.println("amountDay");
                    double amountDay = Double.parseDouble(input.nextLine());
                    System.out.println("salary");
                    double salary = Double.parseDouble(input.nextLine());

                    MainStaff staff = new MainStaff(id, name, birthday, amountDay, salary);

                    list.add(staff);

                    break;
                case 2:
//                    for (int i = 0; i < list.size(); i++) {
//                        System.out.println(list.get(i));
//                    }
                    System.out.println(mainStaff.total());

                    break;
                case 3:
                    System.exit(3);
                    break;
            }
        }
    }
}
