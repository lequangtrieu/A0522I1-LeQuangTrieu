package ss20_code_fpt.Assignment.Utils;

import java.util.Scanner;

public class Regex {
    private static final Scanner input = new Scanner(System.in);

    private static final String REGEX_STAFF_TYPE = "Administrative staff|Marketing staff|Department manager";
    private static final String REGEX_ID = "D+[0-9]{1,4}";
    private static final String REGEX_NAME_ADDRESS = "^([A-Z][a-z]{1,10})?( ?)?([A-Z][a-z]{1,10})?( ?)?([A-Z][a-z]{1,10})?( ?)?([A-Z][a-z]{1,10})?( ?)?([A-Z][a-z]{1,10})";
    private static final String REGEX_EMAIL = "[A-Za-z0-9_.]+@[A-Za-z]+([.])[A-Za-z]+";

    public static String inputStaffType() {
        System.out.println("Enter staff type:");
        String staffType = input.nextLine();
        while (!staffType.matches(REGEX_STAFF_TYPE)) {
            System.err.println("You input bad format, please please get back !");
            System.out.println("please enter 'Administrative staff' or 'Marketing staff' or 'Department manager'");
            staffType = input.nextLine();
        }
        return staffType;
    }

    public static String inputId() {
        System.out.println("Enter id:");
        String id = input.nextLine();
        while (!id.matches(REGEX_ID)) {
            System.err.println("You input bad format, please please get back !");
            id = input.nextLine();
        }
        return id;
    }

    public static String inputName() {
        System.out.println("Enter name:");
        String name = input.nextLine();
        while (!name.matches(REGEX_NAME_ADDRESS)) {
            System.err.println("You input bad format, please please get back !");
            name = input.nextLine();
        }
        return name;
    }

    public static String inputAddress() {
        System.out.println("Enter address:");
        String address = input.nextLine();
        while (!address.matches(REGEX_NAME_ADDRESS)) {
            System.err.println("You input bad format, please please get back !");
            address = input.nextLine();
        }
        return address;
    }

    public static String inputEmail() {
        System.out.println("Enter email:");
        String email = input.nextLine();
        while (!email.matches(REGEX_EMAIL)) {
            System.err.println("You input bad format, please please get back !");
            email = input.nextLine();
        }
        return email;
    }

    public static int inputAge() {
        System.out.println("Enter age:");
        int age = 0;
        do {
            try {
                age = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Enter the age (number)!");
            }
            if (age < 17 || age > 70) {
                System.err.println("You input bad format, please please get back !");
            }
        } while (age < 17 || age > 70);
        return age;
    }

    public static int inputInteger() {
        while (true) {
            try {
                return Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Please enter the (number)!");
            }
        }
    }

}
