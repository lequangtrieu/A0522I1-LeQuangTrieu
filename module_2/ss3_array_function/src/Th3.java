import java.util.Scanner;

public class Th3 {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner input = new Scanner(System.in);
            do {
                System.out.println("enter the size: ");
                size = input.nextInt();
                if(size > 20) {
                    System.out.println("please enter the length less than 21");
                }
            } while (size > 20);
            arr = new  int[size];
            for(int i = 0; i < arr.length; i++) {
                System.out.println("enter the element " + (i+1) + " of array: ");
                arr[i] = input.nextInt();
            }
        System.out.println("the array is: ");
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }

            int max = arr[0];
            int index = 1;
            for(int i = 1; i < arr.length; i++) {
                if(arr[i] > max) {
                    max = arr[i];
                    index = i + 1;
                }
            }
        System.out.println("\nmax is: " + max + " in the position: " + index);
    }
}
