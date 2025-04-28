package se.branko;

import se.branko.dependencyInversion.Discount;

public class TwentyFivePercentDiscount implements IDiscount {
    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice * 0.75; // 25% rabatt
    }
}
