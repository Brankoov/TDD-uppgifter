package se.branko.animal;

public class Bird implements IAnimal {
    @Override
    public void makeSound() {
        System.out.println("bird chirps!");
    }
}
