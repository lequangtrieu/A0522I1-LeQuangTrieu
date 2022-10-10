import java.util.Scanner;

public class Bt3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[5];
        int[] arr3 = new int[8];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("enter the element "+(i+1)+ " of array 1: ");
            arr1[i] = input.nextInt();
        }
        System.out.println("the array 1 is: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " \t ");
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print("\nenter the element "+(i+1)+ " of array 2: ");
            arr2[i] = input.nextInt();
        }
        System.out.println("the array 2 is: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " \t ");
        }
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        int index = 0;
        for (int i = arr1.length; i < arr3.length; i++) {
            arr3[i] = arr2[index];
            index++;
        }
        System.out.println("\n the array3 after concat is: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " \t ");
        }
    }
}
