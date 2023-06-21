package ss24_su23_fpt.ss1_sort_programing.controller;

import ss24_su23_fpt.ss1_sort_programing.library.Sorting;

import java.util.Scanner;

public class SortPrograming {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("==== SORT PROGRAMING ====");
        System.out.println("enter the size of the array you wanna sort");
        int size = Integer.parseInt(input.nextLine());

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("enter the element " + (i + 1) + " of the array:");
            arr[i] = Integer.parseInt(input.nextLine());
        }

        System.out.println("the array before sorting:");
        Sorting.printArray(arr);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Quick Sort");
            System.out.println("3. Exit");
            System.out.println("enter your choice:");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("bubble sort: ");
                    Sorting.bubbleSort(arr);
                    break;
                case 2:
                    System.out.println("quick sort: ");
                    Sorting.quickSort(arr, 0, arr.length - 1);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("invalid! Please enter right number");
            }
            System.out.println("the array after sorting:");
            Sorting.printArray(arr);
        }
    }
}
