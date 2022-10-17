package ss6_inheritance.Bt3_Point_MoveablePoint;

public class Point {
    protected float x = 1.0f;
    protected float y = 1.0f;

    public Point() {

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] array_2d = {x, y};
        return  array_2d;
    }

    public String toString() {
        return "{" + x + ", " + y + "}";
    }
}
