package ss6_inheritance.Bt1_Circle_Cylinder;


import ss6_inheritance.Bt1_Circle_Cylinder.Circle;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.getRadius() * this.getRadius() * this.height * Math.PI;
    }

    @Override
    public String toString() {
        return "a cylinder with height = "
                + getHeight()
                + " have the volume = "
                + getVolume()
                + " and the Area = "
                + getArea()
                + ", which is a subclass of: "
                + super.toString();
    }

}
