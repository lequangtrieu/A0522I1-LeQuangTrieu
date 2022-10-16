package ss5_static.Th2_StaticProperty;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mecs", "S1");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("BMW", "s2");
        System.out.println(Car.numberOfCar);
    }
}
