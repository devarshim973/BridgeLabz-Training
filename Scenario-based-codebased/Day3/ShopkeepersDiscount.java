import java.util.Scanner;

public class ShopkeepersDiscount {

    // Constants for discount rates
    public static final double DISCOUNT_10 = 0.10;
    public static final double DISCOUNT_20 = 0.20;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfItems;
        double price;
        double totalBill = 0.0;
        double discount;
        double finalAmount;

        System.out.print("Enter number of items: ");
        numberOfItems = sc.nextInt();

        // Input item prices using for-loop
        for (int i = 1; i <= numberOfItems; i++) {
            System.out.print("Enter price of item " + i + ": ");
            price = sc.nextDouble();
            totalBill += price;
        }

        // Discount calculation using if-else
        if (totalBill >= 5000) {
            discount = totalBill * DISCOUNT_20;
        } else if (totalBill >= 1000) {
            discount = totalBill * DISCOUNT_10;
        } else {
            discount = 0.0;
        }

        finalAmount = totalBill - discount;

        // Display bill details
        System.out.println("\n----- BILL DETAILS -----");
        System.out.println("Total Bill     : ₹" + totalBill);
        System.out.println("Discount       : ₹" + discount);
        System.out.println("Final Amount   : ₹" + finalAmount);

        sc.close();
    }
}
