package ss7_Abstract_Interface.Th1_Animal.Fruit;

public class Main {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit :
                fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
