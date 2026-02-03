package com.Day4.NullPointerException.ECommerce;

public class EcommerceApplicationMain {

    private static final double DEFAULT_DISCOUNT = 5.0;

    public static void main(String[] args) {

        Seller seller = new Seller("TechStore", "Bangalore");
        DeliveryPartner delivery = new DeliveryPartner("BlueDart", "1800-123-456");

        Product product = new Product(
                1001,
                "Laptop",
                null,
                "SAVE10",
                null,
                seller,
                delivery
        );

        // 1. Default discount
        double discount = product.getDiscount()
                .orElse(DEFAULT_DISCOUNT);
        System.out.println("Discount: " + discount + "%");

        // 2. Coupon logic
        product.getCouponCode().ifPresent(code ->
                System.out.println("Coupon Applied: " + code)
        );

        // 3. Seller details safely
        String sellerName = product.getSeller()
                .map(Seller::getSellerName)
                .orElse("Seller not available");
        System.out.println("Seller: " + sellerName);

        // 4. Product description
        String description = product.getDescription()
                .orElse("No description available");
        System.out.println("Description: " + description);

        // 5. Delivery partner info
        product.getDelivery()
                .map(DeliveryPartner::getPartnerName)
                .ifPresent(p ->
                        System.out.println("Delivery Partner: " + p)
                );
    }
}
