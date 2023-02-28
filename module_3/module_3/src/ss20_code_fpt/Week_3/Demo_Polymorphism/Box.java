package ss20_code_fpt.Week_3.Demo_Polymorphism;

public class Box extends Rectangle{
    int height = 0;
    public void set(int l, int w, int h) {
        super.setValue(l, w);
        height = h > 0 ? h: 0;
    }

    @Override
    public String toString() {
        return "Box{" +
                "height=" + height +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}
