import java.util.*;

public class StudentFeeandUniDiscount {
    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Declare variables
        double fee;
        double discountPercent;
        double discount;
        double finalFee;

        // Take student fee as input
        System.out.print("Enter the student fee (INR): ");
        fee = input.nextDouble();

        // Take discount percentage as input
        System.out.print("Enter the university discount percentage: ");
        discountPercent = input.nextDouble();

        // Calculate discount amount
        discount = (fee * discountPercent) / 100;

        // Calculate final fee after discount
        finalFee = fee - discount;

        // Display the result
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);

        // Close the scanner
        input.close();
    }
}