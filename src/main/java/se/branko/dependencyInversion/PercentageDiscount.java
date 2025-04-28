package se.branko.dependencyInversion;

public class PercentageDiscount implements Discount{

    @Override
    public double applyDiscount(double total) {
        return total * 0.9; //10% Discount
    }
}
