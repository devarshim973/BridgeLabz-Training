package com.Generics.DynamicOnlineMarketplace;

class MarketplaceProduct<T extends ProductCategory> {

    private String productName;
    private double price;
    private T category;

    public MarketplaceProduct(String productName,
                              double price,
                              T category) {
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDetails() {
        return productName + " | " +
               category.getCategoryName() +
               " | Price: " + price;
    }
}
