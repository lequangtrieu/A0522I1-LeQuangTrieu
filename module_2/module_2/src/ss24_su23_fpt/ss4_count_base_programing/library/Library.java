package ss24_su23_fpt.ss4_count_base_programing.library;

import ss24_su23_fpt.ss4_count_base_programing.util.Regex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Library implements ILibrary {
    private final Scanner input = new Scanner(System.in);

    @Override
    public void countNumber() {
        Map<String, Integer> wordMap = new HashMap<>();
        Map<String, Integer> characterMap = new HashMap<>();

        System.out.println("enter the string:");
        String s = input.nextLine();
        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (wordMap.containsKey(arr[i])) {
                wordMap.put(arr[i], wordMap.get(arr[i]) + 1);
            } else {
                wordMap.put(arr[i], 1);
            }
        }
        System.out.println(wordMap);

        String[] character = s.replaceAll(" ", "").split("");

        for (int i = 0; i < character.length; i++) {
            if (characterMap.containsKey(character[i])) {
                characterMap.put(character[i], characterMap.get(character[i]) + 1);
            } else {
                characterMap.put(character[i], 1);
            }
        }
        System.out.println(characterMap);
    }

    @Override
    public void baseNumber() {
        boolean exit = false;
        while (!exit) {
            System.out.println("Select the input base: ");
            System.out.println("1. Binary");
            System.out.println("2. Decimal");
            System.out.println("3. Hexadecimal");
            int inputBase = Regex.inputNum();

            System.out.println("Select the output base: ");
            System.out.println("1. Binary");
            System.out.println("2. Decimal");
            System.out.println("3. Hexadecimal");
            int outputBase = Regex.inputNum();

            System.out.println("Enter the input value: ");
            String inputValue = null;

            switch (inputBase) {
                case 1:
                    inputValue = Regex.inputBinary();
                    break;
                case 2:
                    inputValue = String.valueOf(Regex.inputDecimal());
                    break;
                case 3:
                    inputValue = Regex.inputHexa();
                    break;
            }

            String outputValue = convertBase(inputValue, inputBase, outputBase);
            System.out.println("Output value is: " + outputValue);

            System.out.println("Do you want to continue? (Y/N)");
            String choice = Regex.inputYN();
            if (choice.equalsIgnoreCase("N")) {
                exit = true;
            }
        }
    }

    private String convertBase(String inputValue, int inputBase, int outputBase) {
        int decimalValue;

        if (inputBase == 1) {
            decimalValue = Integer.parseInt(inputValue, 2);
        } else if (inputBase == 2) {
            decimalValue = Integer.parseInt(inputValue);
        } else {
            decimalValue = Integer.parseInt(inputValue, 16);
        }

        String outputValue;

        if (outputBase == 1) {
            outputValue = Integer.toBinaryString(decimalValue);
        } else if (outputBase == 2) {
            outputValue = Integer.toString(decimalValue);
        } else {
            outputValue = Integer.toHexString(decimalValue);
        }
        return outputValue;
    }
}
