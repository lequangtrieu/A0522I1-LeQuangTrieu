package ss5_static.Bt1_AccessModifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * PI;
    }

    public String toString() {
        return "The area of the circle have the radius = "+ this.getRadius()+ " is: " + this.getArea();
    }
}
