package se.branko;

public class TenPercentDiscount implements IDiscount {
    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice * 0.9; // 10% rabatt
    }
}
