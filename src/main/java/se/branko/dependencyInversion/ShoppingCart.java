package se.branko.dependencyInversion;

public class ShoppingCart {
    private Discount discount;

    public ShoppingCart(Discount discount) {
        this.discount = discount;
    }

    public double calculateTotal(double total){
        return discount.applyDiscount(total);
    }
}
