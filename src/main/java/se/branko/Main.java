package se.branko;

public class Main {
    private Item item;

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


    }

}
