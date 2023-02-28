package ss20_code_fpt.Week_1.Lab_1B_NC;

import java.util.Scanner;

public class SumTwoMatrix {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr1 = {{7, 2}, {5, 3}};
        int[][] arr2 = {{2, 1}, {3, 1}};

        int row = 2;
        int col = 2;
        int[][] arr3 = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr3[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
