import java.util.Scanner;
public class Th1 {
    public static void main(String[] args) {
        double width;
        double height;
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter width: ");
        width = scanner.nextDouble();
        System.out.println("enter height: ");
        height = scanner.nextDouble();

        double area = width * height;
        System.out.println("Area is: " + area);

    }
}
