import java.util.Scanner;

public class Th5 {
    public static int minValue(int[] array) {
        int index = 0;
        for(int i = 1; i < array.length; i++) {
            if(array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {15, 12, 8, 6, 7, 1, 9};
        int index = minValue(arr);
        System.out.println("the min is: " + arr[index]);
    }
}
