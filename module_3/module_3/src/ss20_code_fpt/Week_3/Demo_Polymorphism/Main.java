package ss20_code_fpt.Week_3.Demo_Polymorphism;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setValue(5);
        System.out.println(r.toString());
        r.setValue(10, 20);
        System.out.println(r.toString());
        Box b = new Box();
        b.set(5, 10, 15);
        System.out.println(b.toString());
    }
}
