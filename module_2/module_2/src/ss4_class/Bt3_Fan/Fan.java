package ss4_class.Bt3_Fan;

public class Fan {
    private final int slow = 1;
    private final int medium = 2;
    private final int fast = 3;
    private boolean isOn = false;
    private int speed;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return this.speed;
    }

    public boolean getOn() {
        return this.isOn;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean status) {
        this.isOn = status;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (isOn) {
            return "Fan is on, speed = " + this.getSpeed() + ", radius = " + this.getRadius() + ", color = " + this.getColor();
        } else {
            return "Fan is off, speed = " + this.getSpeed() + ", radius = " + this.getRadius() + ", color = " + this.getColor();
        }
    }
}
