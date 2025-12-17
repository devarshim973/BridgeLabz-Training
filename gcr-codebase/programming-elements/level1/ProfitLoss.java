import java.util.*;


public class ProfitLoss {
    public static void main(String[] args) {
        // Cost price and selling priceof the product
        double costPrice = 129;
        double sellingPrice = 191;
        // Calculate profit using the formula: 
        double profit = sellingPrice - costPrice;
        // Calculate profit percentage
        double profitPercentage = (profit / costPrice) * 100;
         
     // Display cost price, selling price, profit, and profit percentage
        System.out.println(
            "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
            "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage
        );
    }
}
