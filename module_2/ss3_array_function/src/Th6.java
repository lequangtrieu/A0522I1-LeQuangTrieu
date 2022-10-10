import java.util.Scanner;

public class Th6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.println("enter the size of the array saving the number of the students (less than 31): ");
            size = input.nextInt();
            if (size > 30) {
                System.out.println("please enter the size less than 31: ");
            }
        } while (size > 30);
        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter the mark of the student: ");
            arr[i] = input.nextDouble();
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 5) {
                count++;
            }
        }
        System.out.println("the number of students passed is: " + count);
    }
}
