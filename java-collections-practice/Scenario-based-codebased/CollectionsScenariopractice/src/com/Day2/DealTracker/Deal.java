package com.Day2.DealTracker;

public class Deal extends Promotion {

    public Deal(String dealCode, LocalDate validTill,
                int discountPercentage, int minimumPurchase) {
        super(dealCode, validTill, discountPercentage, minimumPurchase);
    }
}
