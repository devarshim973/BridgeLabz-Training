package com.Generics.DynamicOnlineMarketplace;

import java.util.ArrayList;
import java.util.List;

class ProductCatalog {

    private List<MarketplaceProduct<? extends ProductCategory>> catalog;

    public ProductCatalog() {
        catalog = new ArrayList<>();
    }

    public void addProduct(
            MarketplaceProduct<? extends ProductCategory> product) {
        catalog.add(product);
    }

    public void showCatalog() {
        for (MarketplaceProduct<?> product : catalog) {
            System.out.println(product.getDetails());
        }
    }
}
