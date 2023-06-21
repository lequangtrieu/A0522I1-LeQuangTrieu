package ss24_su23_fpt.ss4_count_base_programing.util;

import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class Regex {
    public static final String REGEX_HEXA = "[0-9A-F]+";
    public static final String REGEX_BINARY = "[0|1]+";
    public static final String REGEX_Y_N = "Y|N";
    private static final Scanner input = new Scanner(System.in);
    private static String getInputValue() {
        return input.nextLine().trim();
    }

    public static String inputYN() {
        System.out.println("Enter your choice:");
        String check = getInputValue();
        while (!check.matches(REGEX_Y_N)) {
            System.err.println("You input bad format, please please get back !");
            System.out.println("please enter Y or N");
            check = getInputValue();
        }
        return check;
    }
    public static int inputNum() {
        System.out.println("Enter your choice:");
        int choice = 0;
        do {
            try {
                choice = Integer.parseInt(getInputValue());
            } catch (NumberFormatException e) {
                System.err.println("Enter your choice 1 or 2 or 3");
            }
            if (choice < 1 || choice > 3) {
                System.err.println("You input bad format, please please get back !");
                System.out.println("please follow the format of 1 or 2 or 3");
            }
        } while (choice < 1 || choice > 3);
        return choice;
    }

    public static int inputDecimal() {
        while (true) {
            try {
                return Integer.parseInt(getInputValue());
            } catch (NumberFormatException e) {
                System.err.println("Please enter the (number)!");
            }
        }
    }

    public static String inputBinary() {
        String binary = getInputValue();
        while (!binary.matches(REGEX_BINARY)) {
            System.err.println("You input bad format, please please get back !");
            System.out.println("please follow the format of binary 0 and 1");
            binary = getInputValue();
        }
        return binary;
    }

    public static String inputHexa() {
        String hexa = getInputValue();
        while (!hexa.matches(REGEX_HEXA)) {
            System.err.println("You input bad format, please please get back !");
            System.out.println("please follow the format of hexadecimal 0 to 9 and A to B");
            hexa = getInputValue();
        }
        return hexa;
    }

}
