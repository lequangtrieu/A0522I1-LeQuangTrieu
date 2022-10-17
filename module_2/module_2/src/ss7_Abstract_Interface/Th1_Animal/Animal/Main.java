package ss7_Abstract_Interface.Th1_Animal.Animal;

import ss7_Abstract_Interface.Th1_Animal.Edible.Edible;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal:
             animals) {
            System.out.println(animal.makeSound());

            if(animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }

    }
}
