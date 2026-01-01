package com.encapsulationandpolymorphism.ECommercePlatform;

import java.util.List;

class PriceCalculatorService {

    public static void printFinalPrices(List<Product> productList) {

        for (Product product : productList) {

            double price = product.getPrice();
            double discount = product.calculateDiscount();
            double tax = 0;

            if (product instanceof Taxable) {
                tax = ((Taxable) product).calculateTax();
            }

            double finalPrice = price + tax - discount;

            System.out.println(
                    product.getName() +
                    " | Final Price: " + finalPrice
            );
        }
    }
}
