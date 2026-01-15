package com.Generics.DynamicOnlineMarketplace;

class DiscountEngine {

    public static <T extends MarketplaceProduct<?>>
    void applyDiscount(T product, double percentage) {

        double discountedPrice =
                product.getPrice()
                - (product.getPrice() * percentage / 100);

        product.setPrice(discountedPrice);
    }
}
