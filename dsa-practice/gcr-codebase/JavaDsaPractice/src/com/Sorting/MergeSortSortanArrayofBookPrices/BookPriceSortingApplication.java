package com.Sorting.MergeSortSortanArrayofBookPrices;

public class BookPriceSortingApplication {

    public static void main(String[] args) {

        double[] bookPrices = {499.50, 299.99, 899.00, 199.75, 650.00};

        System.out.println("Before Sorting:");
        printPrices(bookPrices);

        MergeSortUtility.sortAscending(bookPrices);

        System.out.println("After Sorting:");
        printPrices(bookPrices);
    }

    private static void printPrices(double[] prices) {
        for (double price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }
}
