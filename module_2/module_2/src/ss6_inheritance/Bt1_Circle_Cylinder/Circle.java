package ss6_inheritance.Bt1_Circle_Cylinder;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return  2 * this.radius * Math.PI;
    }

    public String toString() {
        return "a circle with radius = "
                + getRadius()
                + " and color = "
                + getColor()
                + ", which give the Area = "
                + getArea()
                + " and the Perimeter = "
                + getPerimeter();
    }
}
