package ss22_case_study.Test;

public class Main {
    static public int X = 2;

    public static void main(String[] args) {
        Main o1 = new Main();
        Main o2 = new Main();
        o2.X = 5;
        System.out.printf("x=%d, y=%d, z=%d", o1.X, o2.X, Main.X);
    }
}
