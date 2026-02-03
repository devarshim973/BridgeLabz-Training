package com.Day4.NullPointerException.ECommerce;

class Seller {

    private String sellerName;
    private String location;

    public Seller(String sellerName, String location) {
        this.sellerName = sellerName;
        this.location = location;
    }

    public String getSellerName() {
        return sellerName;
    }
}
