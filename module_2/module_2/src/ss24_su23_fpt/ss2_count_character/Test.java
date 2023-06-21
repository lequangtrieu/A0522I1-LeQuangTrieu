package ss24_su23_fpt.ss2_count_character;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a string: ");
        String userInput = scanner.nextLine();

        int letterCount = 0;
        int charCount = 0;

        for (char c : userInput.toCharArray()) {
            if (Character.isLetter(c)) {
                letterCount++;
            } else if (c != ' ') {
                charCount++;
            }
        }

        System.out.println("Number of letters: " + letterCount);
        System.out.println("Number of characters (excluding spaces): " + charCount);
    }
}
