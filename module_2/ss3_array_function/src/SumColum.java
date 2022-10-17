import java.util.Scanner;

public class Bt6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the row of the array: ");
        int row = input.nextInt();
        System.out.println("enter the col of the array: ");
        int col = input.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("enter the element "+i+", "+j+" of the array:" );
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("the array is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int index_row = 0;
        int index_col = 0;
        int max = arr[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    index_row = i;
                    index_col = j;
                }
            }
        }
        System.out.println("the max is: " + max);
        System.out.println("index row is: " + index_row);
        System.out.println("index col is: "+ index_col);

    }
}
