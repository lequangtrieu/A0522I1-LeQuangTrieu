package ss5_static;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCar;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }

    public String getName() {
        return this.name;
    }

    public  String getEngine() {
        return this.engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }


}