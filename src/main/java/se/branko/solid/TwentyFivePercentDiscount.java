package se.branko.solid;

public class TwentyFivePercentDiscount implements IDiscount {
    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice * 0.75; // 25% rabatt
    }
}
