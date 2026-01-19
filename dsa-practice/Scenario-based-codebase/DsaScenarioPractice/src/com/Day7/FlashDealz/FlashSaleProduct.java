package com.Day7.FlashDealz;

public class FlashSaleProduct {

    private int productId;
    private String productName;
    private double discountPercentage;

    public FlashSaleProduct(int productId, String productName, double discountPercentage) {
        this.productId = productId;
        this.productName = productName;
        this.discountPercentage = discountPercentage;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    @Override
    public String toString() {
        return "ProductID=" + productId +
               ", Name=" + productName +
               ", Discount=" + discountPercentage + "%";
    }
}
