package ss6_inheritance.Bt2_Point2D_Point3D;

public class Point3D extends Point2D {
    private float z = 1.0f;

    public Point3D() {
        super();
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.z = z;
        this.x = x;
        this.y = y;
    }

    public float[] getXYZ() {
        float[] array_3d = {x, y, z};
        return array_3d;
    }

    public String toString() {
        return "{" + x + ", " + y + ", " + z + "}";
    }
}
