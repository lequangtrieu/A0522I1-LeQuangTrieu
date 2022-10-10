import java.util.Scanner;
public class Th2 {
    public static void main(String[] args) {
        System.out.println("giai phuong trinh bac nhat ax + b = 0");
        double a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a: ");
        a = scanner.nextDouble();
        System.out.println("enter b: ");
        b = scanner.nextDouble();

        if(a != 0) {
            System.out.println("pt co 1 nghiem duy nhat: x = " + (-b/a));
        } else {
            if(b != 0) {
                System.out.println("pt vo nghiem");
            } else {
                System.out.println("pt co vo so nghiem");
            }
        }
    }
}
