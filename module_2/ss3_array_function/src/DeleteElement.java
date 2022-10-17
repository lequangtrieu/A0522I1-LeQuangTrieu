import java.util.Scanner;

public class Bt1 {
    public static void main(String[] args) {
        int[] arr;
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.println("enter the size of array: ");
            size = input.nextInt();
            if(size > 20) {
                System.out.println("please enter the size less than 21");
            }
        } while (size > 20);
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter the element " +(i + 1)+ " of array");
            arr[i] = input.nextInt();
        }
        System.out.print("The array before remove the element: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println("\nenter the element of array you wanna remove it: ");
        int x = input.nextInt();
        int index_del = 0;
        for (int i = 0; i < arr.length; i++) {
            if(x == arr[i]) {
                index_del = i;
                break;
            }
        }
        for (int i = index_del; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        System.out.print("the array after removing: " );
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
