package com.Day2.DealTracker;

import java.time.LocalDate;

public abstract class Promotion {

    protected String dealCode;
    protected LocalDate validTill;
    protected int discountPercentage;
    protected int minimumPurchase;

    public Promotion(String dealCode, LocalDate validTill,
                     int discountPercentage, int minimumPurchase) {
        this.dealCode = dealCode;
        this.validTill = validTill;
        this.discountPercentage = discountPercentage;
        this.minimumPurchase = minimumPurchase;
    }

    public String getDealCode() {
        return dealCode;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public LocalDate getValidTill() {
        return validTill;
    }

    @Override
    public String toString() {
        return dealCode + " | " + discountPercentage + "% | Valid Till: " + validTill;
    }
}
