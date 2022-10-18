package ss7_Abstract_Interface.Bt2_Shape_Colorable.Shape;

import ss7_Abstract_Interface.Bt2_Shape_Colorable.Colorable;

public class Square extends Shape implements Colorable {
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


    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
