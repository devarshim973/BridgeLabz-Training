package com.Sorting.QuickSortSortProductPrices;

public class ProductPriceSortingApplication {

    public static void main(String[] args) {

        double[] productPrices = {1499.99, 299.50, 999.00, 199.99, 499.75};

        System.out.println("Before Sorting:");
        displayPrices(productPrices);

        QuickSortPriceUtility.sortAscending(productPrices);

        System.out.println("After Sorting:");
        displayPrices(productPrices);
    }

    private static void displayPrices(double[] prices) {
        for (double price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }
}

