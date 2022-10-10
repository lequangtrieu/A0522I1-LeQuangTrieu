import java.util.Scanner;

public class Bt2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.println("enter the size of the array: ");
            size = input.nextInt();
            if(size > 20) {
                System.out.println("please enter the size less than 21");
            }
        } while (size > 20);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter the element "+(i+1)+ " of the array");
            arr[i] = input.nextInt();
        }
        System.out.print(" the array before editing");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\n enter the number you wanna adding: ");
        int x = input.nextInt();
        int index;
        do {
            System.out.println("enter the index you wanna adding that number: ");
            index = input.nextInt();
            if(index < 0 && index > (arr.length - 1)) {
                System.out.println("please enter the index from 0 to " + (arr.length - 1));
            }
        } while (index < 0 && index > (arr.length - 1));

        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = x;

        System.out.println("the array after adding is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }


    }
}
