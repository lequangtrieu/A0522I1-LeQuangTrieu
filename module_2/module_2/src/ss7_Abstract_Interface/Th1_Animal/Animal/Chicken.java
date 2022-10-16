package ss7_Abstract_Interface.Th1_Animal.Animal;

import ss7_Abstract_Interface.Th1_Animal.Edible.Edible;

public class Chicken extends  Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
