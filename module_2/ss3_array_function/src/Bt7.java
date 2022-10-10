import java.util.Scanner;

public class Bt7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row;
        int col;
        do {
            System.out.println("enter the row of the array: ");
            row = input.nextInt();
            System.out.println("enter the colum of the array: ");
            col = input.nextInt();
            if (row > 10 || col > 10) {
                System.out.println("please enter the row and colum of the array less than 10");
            }
        } while (row > 10 || col > 10);
        double[][] arr = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("enter the element " +i+", "+j+" of the array");
                arr[i][j] = input.nextDouble();
            }
        }
        System.out.println("the array is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("enter the colum you wanna summing: ");
        int n = input.nextInt();
        double sum = 0.0;
        for (int i = 0; i < row; i++) {
            sum += arr[i][n - 1];
        }
        System.out.println("the sum is: "+ sum);
    }
}
