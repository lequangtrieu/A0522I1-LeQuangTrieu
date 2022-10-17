package ss7_Abstract_Interface.Th2_Shape;

public class Circle {
    protected double radius = 1.0;
    protected String color = "red";
    private final double PI = 3.14;

    public Circle() {

    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * PI;
    }

    public String toString() {
        return "The area of the circle have the radius = "+ this.getRadius()+ " is: " + this.getArea();
    }
}
