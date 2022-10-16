package ss6_inheritance.Th1_Shape;

public class Shape_Test {
    public static void main(String[] args) {
        Th1_Shape_Class shape = new Th1_Shape_Class();
        System.out.println(shape);
        shape = new Th1_Shape_Class("red", false);
        System.out.println(shape);
    }
}
