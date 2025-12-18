import java.util.*;

public class CourseFeeDiscount {
    public static void main(String[] args) {
        //oroginal fees
        double fee = 125000;

        // Discount percentage offered by the university
        double discountPercent = 10;

         // Calculate the final fee after discount
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);
    }
}

