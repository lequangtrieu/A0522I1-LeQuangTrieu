package ss20_code_fpt.Lab5.Utils;

import java.util.Scanner;

public class Regex {
    private static final Scanner input = new Scanner(System.in);

    private static final String REGEX_ID = "S+[0-9]{2,4}";

//    private static final String REGEX_NAME = "(^[A-Za-z]{2,16})([ ]{0,1})([A-Za-z]{2,16})?([ ]{0,1})?([A-Za-z]{2,16})?([ ]{0,1})?([A-Za-z]{2,16})";

    private static final String REGEX_NAME = "^([A-Z][a-z]{1,10})?( ?)?([A-Z][a-z]{1,10})?( ?)?([A-Z][a-z]{1,10})?( ?)?([A-Z][a-z]{1,10})?( ?)?([A-Z][a-z]{1,10})";

    private static final String REGEX_TEST = "^(([A-Z][a-z]{1,10})?( ?)) + ";

    public static String inputId(){
        System.out.println("enter id:");
        String id = input.nextLine();
        while (!id.matches(REGEX_ID)) {
            System.err.println("You input bad format, please please get back !");
            id = input.nextLine();
        }
        return id;
    }

    public static String inputName() {
        System.out.println("enter name:");
        String name = input.nextLine();
        while (!name.matches(REGEX_NAME)) {
            System.err.println("You input bad format, please follow the format Sxx!");
            name = input.nextLine();
        }
        return name;
    }

    public static double inputAverage() {
        System.out.println("enter average:");
        double average = 0;
        do {
            try {
                average = Double.parseDouble(input.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Enter a number");
            }
            if (average < 0 || average > 10) {
                System.err.println("You input bad format, please please get back !");
            }
        } while (average < 0 || average > 10);
        return average;
    }
}
