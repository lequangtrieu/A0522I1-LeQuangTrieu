import java.util.Scanner;

public class Th2 {
    public static void main(String[] args) {
        String[] arr = {"John", "Mary", "Tom", "Ken", "Wen"};
        Scanner input = new Scanner(System.in);
        System.out.println("enter the name of the students: ");
        String name = input.nextLine();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(name)) {
                System.out.println("the indexOf is: " + (i+1));
            } else {
                System.out.println("the name is not exist");
                break;
            }
        }
    }
}
