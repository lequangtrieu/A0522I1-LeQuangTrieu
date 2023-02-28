package ss20_code_fpt.Week_1.Lab_1B_NC;

import java.util.Scanner;

public class RegexName {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter name:");
        String name = "      l3E      qU*aN)G         T&rI+Eu           ";
//        System.out.println(name);
        name = name.trim().toLowerCase();
        name = name.replaceAll("\\s+", " "); // loại bỏ khoảng trắng
        name = name.replaceAll("[^a-zA-Z ]", ""); // loại bỏ kí tự đặc biệt

//        System.out.println(name);

        String[] arr = name.split(" ");
        name = "";
        for (int i = 0; i < arr.length; i++) {
            name += String.valueOf(arr[i].charAt(0)).toUpperCase() + arr[i].substring(1);// upper case
            if (i < arr.length - 1) {
                name += " ";
            }
        }
        System.out.println(name);
    }
}
