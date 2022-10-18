package ss7_Abstract_Interface.Bt1_Shape_Resizeable.Shape;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4.9, 5.6);
        System.out.println(rectangle);

        System.out.println("before: ");
        System.out.println(rectangle.getArea());

        System.out.println("after: ");
        System.out.println(rectangle.resize(0.7));
    }
}
