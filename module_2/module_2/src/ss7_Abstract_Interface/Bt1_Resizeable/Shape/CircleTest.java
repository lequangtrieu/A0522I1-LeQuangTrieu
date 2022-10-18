package ss7_Abstract_Interface.Bt1_Resizeable.Shape;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.8);
        System.out.println(circle);

        System.out.println("the area before resizeable: ");
        System.out.println(circle.getArea());

        System.out.println("the area after resizeable:");

        System.out.println(circle.resize(0.2));
    }
}