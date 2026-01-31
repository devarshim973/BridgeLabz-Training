package com.LambdaExpressions.CustomSortingECommerce;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ECommerceSorting {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 70000, 4.5, 10));
        products.add(new Product("Mobile", 30000, 4.7, 15));
        products.add(new Product("Headphones", 5000, 4.2, 25));

        // 🔸 Sort by Price (Low to High)
        products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        System.out.println("Sorted by Price:");
        products.forEach(System.out::println);

        // 🔸 Sort by Rating (High to Low)
        products.sort((p1, p2) -> Double.compare(p2.getRating(), p1.getRating()));
        System.out.println("\nSorted by Rating:");
        products.forEach(System.out::println);

        // 🔸 Sort by Discount (High to Low)
        products.sort((p1, p2) -> Double.compare(p2.getDiscount(), p1.getDiscount()));
        System.out.println("\nSorted by Discount:");
        products.forEach(System.out::println);
    }
}
