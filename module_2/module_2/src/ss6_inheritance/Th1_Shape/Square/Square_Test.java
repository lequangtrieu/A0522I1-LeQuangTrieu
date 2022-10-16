package ss6_inheritance.Th1_Shape.Square;

public class Square_Test {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(5.5);
        System.out.println(square);
        square = new Square(8.7, "white", true);
        System.out.println(square);
    }
}
