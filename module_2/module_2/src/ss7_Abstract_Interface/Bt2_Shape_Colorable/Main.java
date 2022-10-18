package ss7_Abstract_Interface.Bt2_Shape_Colorable;

import Shape_Source.Circle;
import Shape_Source.Rectangle;
import Shape_Source.Shape;
import Shape_Source.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
            if(shapes[i] instanceof  Square) {
                shapes[i].howToColor();
            }
        }
    }
}
