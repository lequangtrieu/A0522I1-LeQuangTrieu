package ss24_su23_fpt.ss2_count_character;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacter {
    private static final Scanner input = new Scanner(System.in);
    private static final Map<String, Integer> wordMap = new HashMap<>();
    private static final Map<String, Integer> characterMap = new HashMap<>();

    public static void main(String[] args) {
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
        System.out.println(wordMap); //test

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
}
