package menu_csi;

public class Quadratic_equation {
    double a, b, c;

    public Quadratic_equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDelta() {
        return Math.pow(b, 2) - (4 * a * c);
    }

    public double getRoot1() {
        return (-b + Math.pow(b * b - (4 * a * c), 0.5)) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.pow(b * b - (4 * a * c), 0.5)) / (2 * a);
    }

    public double getRoot3() {
        return -b / (2 * a);
    }

}
