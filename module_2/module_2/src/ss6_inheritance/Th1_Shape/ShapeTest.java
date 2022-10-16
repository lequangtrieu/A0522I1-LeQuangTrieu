package ss6_inheritance.Th1_Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Th1ShapeClass shape = new Th1ShapeClass();
        System.out.println(shape);
        shape = new Th1ShapeClass("red", false);
        System.out.println(shape);
    }
}
