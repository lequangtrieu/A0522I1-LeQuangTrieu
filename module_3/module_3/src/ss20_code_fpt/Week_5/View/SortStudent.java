package ss20_code_fpt.Week_5.View;

import ss20_code_fpt.Week_5.Controller.ISchool;
import ss20_code_fpt.Week_5.Controller.School;

import java.util.Scanner;

public class SortStudent {
    private static final ISchool service = new School();
    private static final Scanner input = new Scanner(System.in);

    public static void sortStudent() {
        while (true) {
            System.out.println("1. sort by id");
            System.out.println("2. sort by name");
            System.out.println("3. sort by average point");
            System.out.println("4. return main menu");
            System.out.println("enter your choice:");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    service.sortByID();
                    break;
                case 2:
                    service.sortByName();
                    break;
                case 3:
                    service.sortByAverage();
                    break;
                case 4:
                    return;
            }
        }
    }
}
