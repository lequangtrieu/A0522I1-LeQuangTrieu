package Shape_Source;

public class Square extends Shape {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    public double getPerimeter() {
        return 4 * this.side;
    }

    @Override
    public String toString() {
        return "A Square with side ="
                + getSide()
                + " and the Area ="
                + getArea()
                + ", which is a subclass of "
                + super.toString();
    }
}
