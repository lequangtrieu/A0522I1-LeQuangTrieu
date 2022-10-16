package ss4_class.Th1_Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the width");
        double width = input.nextDouble();
        System.out.println("enter the height");
        double height = input.nextDouble();
        ;
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle " + rectangle.display());
        System.out.println("perimeter is: " + rectangle.getPerimeter());
        System.out.println("area is: " + rectangle.getArea());
    }
}
