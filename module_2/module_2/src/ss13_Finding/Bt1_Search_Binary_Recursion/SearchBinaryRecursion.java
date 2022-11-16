package ss13_Finding.Bt1_Search_Binary_Recursion;

import java.util.Arrays;

public class SearchBinaryRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 8, 5, 25, 45, 7, 26, 43};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 45));
    }
}
