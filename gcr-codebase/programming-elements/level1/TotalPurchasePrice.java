import java.util.*;

public class TotalPurchasePrice {
    public static void main(String[] args) {

        // Create Scanner to take input 
        Scanner sc = new Scanner(System.in);
		
		// Take unit price as input
        System.out.print("Enter the unit price (INR): ");
        double unitPrice = sc.nextDouble();
        System.out.print("Enter the quantity: ");
        int quantity = sc.nextInt();
		
		 // Calculate total purchase price
        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice +" if the quantity " + quantity +" and unit price is INR " + unitPrice);
    }
}

