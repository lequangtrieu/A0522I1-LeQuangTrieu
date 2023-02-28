package ss20_code_fpt.Week_1.Lab1A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintMarkMoreFive {
    private static final Scanner input = new Scanner(System.in);
    private static List<Double> printMark(List<Double> arr) {
        List<Double> result = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= 5 && arr.get(i) <= 10) {
                result.add(arr.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Double> arr = new ArrayList<>();
        arr.add(2.0);
        arr.add(3.0);
        arr.add(4.0);
        arr.add(5.0);
        arr.add(6.0);
        arr.add(7.0);
        arr.add(8.0);
        System.out.println(printMark(arr));
    }
}
