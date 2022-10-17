import java.util.Scanner;

public class Bt8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.println("enter the size of the square array:");
            size = input.nextInt();
            if (size > 10) {
                System.out.println("please enter the size less than 11");
            }
        }while (size > 10);
        double[][] arr = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("enter the element "+i+", "+j+" of the array:");
                arr[i][j] = input.nextDouble();
            }
        }
        System.out.println("the array is");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i][i];
        }
        System.out.println("the sum is: "+ sum);
    }
}
