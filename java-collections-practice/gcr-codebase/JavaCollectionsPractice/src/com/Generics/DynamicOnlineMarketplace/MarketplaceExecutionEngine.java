package com.Generics.DynamicOnlineMarketplace;

class MarketplaceExecutionEngine {

    public static void main(String[] args) {

        MarketplaceProduct<BookCategory> book =
            new MarketplaceProduct<>(
                "Java Programming",
                500,
                new BookCategory()
            );

        MarketplaceProduct<ClothingCategory> shirt =
            new MarketplaceProduct<>(
                "Cotton Shirt",
                1200,
                new ClothingCategory()
            );

        MarketplaceProduct<GadgetCategory> phone =
            new MarketplaceProduct<>(
                "Smartphone",
                20000,
                new GadgetCategory()
            );

        ProductCatalog catalog = new ProductCatalog();

        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        // Apply discount using generic method
        DiscountEngine.applyDiscount(book, 10);
        DiscountEngine.applyDiscount(phone, 5);

        catalog.showCatalog();
    }
}
