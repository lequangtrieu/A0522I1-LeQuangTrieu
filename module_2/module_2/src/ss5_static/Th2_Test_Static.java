package ss5_static;

import java.util.SortedMap;

public class Th2_Test_Static {
    public static void main(String[] args) {
        Car car1 = new Car("Mecs", "S1");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("BMW", "s2");
        System.out.println(Car.numberOfCar);
    }
}
