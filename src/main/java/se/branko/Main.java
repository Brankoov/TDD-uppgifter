package se.branko;

import se.branko.animal.Bird;
import se.branko.animal.Dog;
import se.branko.animal.IAnimal;
import se.branko.dependencyInversion.Discount;
import se.branko.dependencyInversion.FixedAmountDiscount;
import se.branko.dependencyInversion.PercentageDiscount;
import se.branko.dependencyInversion.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        //Items
        Item item1 = new Item("Laptop", 1000.00,1);
        Item item2 = new Item("Phone", 500.00, 2);

        double totalBeforeDiscount = item1.getTotalPrice() + item2.getTotalPrice();
        System.out.println("Total price before discount: " + totalBeforeDiscount);


        // Discount
        double discount = 10.0;
        double discountAmount = totalBeforeDiscount * (discount / 100);
        double totalAfterDiscount = totalBeforeDiscount - discountAmount;
        System.out.println("Discount: $" + discountAmount);
        System.out.println("Total after discount: $" + totalAfterDiscount);

        List<IAnimal> animalList = new ArrayList<>();

        IAnimal bird = new Bird();
        IAnimal bird2 = new Bird();

        IAnimal dog = new Dog();
        IAnimal dog2 = new Dog();

        animalList.add(bird);
        animalList.add(bird2);
        animalList.add(dog);

        for (IAnimal animal : animalList) {
            animal.makeSound();
        }

        Discount percentageDiscount = new PercentageDiscount();
        Discount fixedAmountDiscount = new FixedAmountDiscount();

        ShoppingCart cartWithPercentage = new ShoppingCart(percentageDiscount);
        ShoppingCart cartWithFixedAmount = new ShoppingCart(fixedAmountDiscount);

        double totalAmount = 1000;

        double totalAfterPercentageDiscount = cartWithPercentage.calculateTotal(totalAmount);
        System.out.println("Total after percentage discount: " + totalAfterPercentageDiscount);

        double totalAfterFixedAmount = cartWithFixedAmount.calculateTotal(totalAmount);
        System.out.println("Total after fixed amount: " + totalAfterFixedAmount);

        Product product1 = new Product("Phone", 2000.00);
        Product product2 = new Product("Laptop", 5000.00);

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        // Räkna ut totalpriset
        double totalPrice = 0.0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        System.out.println("Total price before discount: $" + totalPrice);

        // Applicera rabatt
        IDiscount discount1 = new TwentyFivePercentDiscount(); // Eller TenPercentDiscount
        double discountedPrice = discount1.applyDiscount(totalPrice);

        System.out.println("Total price after discount: $" + discountedPrice);
    }

}
