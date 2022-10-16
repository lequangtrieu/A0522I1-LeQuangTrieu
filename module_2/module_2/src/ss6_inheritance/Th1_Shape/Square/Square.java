package ss6_inheritance.Th1_Shape.Square;

import ss6_inheritance.Th1_Shape.Rectangle.Rectangle;
import ss6_inheritance.Th1_Shape.Th1_Shape_Class;

public class Square extends Rectangle {
    public Square() {

    }

    public Square(double side) {
        super(side,side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }
    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "a square with side = "
                + getSide()
                + ", which is a subclass of: "
                + super.toString();
    }
}
