package se.branko.animal;

public class Dog implements IAnimal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks! vuf vuf");
    }
}
