package com.encapsulationandpolymorphism.ECommercePlatform;

import java.util.ArrayList;
import java.util.List;

public class ECommercePlatformRunner {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(
                new ElectronicsItem(1, "Laptop", 60000)
        );

        products.add(
                new ClothingItem(2, "Jacket", 4000)
        );

        products.add(
                new GroceryItem(3, "Rice Bag", 1200)
        );

        PriceCalculatorService.printFinalPrices(products);
    }
}
