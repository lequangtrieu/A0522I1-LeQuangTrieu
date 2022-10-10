import java.util.Scanner;

public class Th1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.println("enter the size");
            size = input.nextInt();
            if(size > 20) {
                System.out.println("please enter the size less than 21");
            }
        } while(size > 20);
        arr = new int[size];
        for(int i = 0; i < arr.length; i++) {
            System.out.println("enter the element " + (i + 1) + " of array: ");
            arr[i] = input.nextInt();
        }

        System.out.printf("Elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }

        System.out.println("\narray after reverse: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
