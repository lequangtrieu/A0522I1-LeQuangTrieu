package ss20_code_fpt.Week_3.Demo_Polymorphism;

public class Rectangle {
    protected int length, width = 0;

    public void setValue(int l) {
        length = l > 0 ? l : 0;
    }

    public void setValue(int l, int w) {
        length = l > 0 ? l : 0;
        width = w > 0 ? w : 0;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
