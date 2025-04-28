package se.branko.dependencyInversion;

public class FixedAmountDiscount implements Discount {

    @Override
    public double applyDiscount(double total) {
        return total -5;
    }
}
