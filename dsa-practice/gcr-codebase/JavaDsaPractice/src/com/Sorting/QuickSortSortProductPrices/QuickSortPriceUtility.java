package com.Sorting.QuickSortSortProductPrices;

public class QuickSortPriceUtility {

    public static void sortAscending(double[] prices) {
        if (prices == null || prices.length < 2) {
            return;
        }
        quickSort(prices, 0, prices.length - 1);
    }

    private static void quickSort(double[] prices, int low, int high) {
        if (low < high) {

            int pivotIndex = partition(prices, low, high);

            // Sort left part
            quickSort(prices, low, pivotIndex - 1);

            // Sort right part
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    private static int partition(double[] prices, int low, int high) {

        double pivot = prices[high]; // Pivot = last element
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (prices[j] <= pivot) {
                i++;
                swap(prices, i, j);
            }
        }

        swap(prices, i + 1, high);
        return i + 1;
    }

    private static void swap(double[] prices, int i, int j) {
        double temp = prices[i];
        prices[i] = prices[j];
        prices[j] = temp;
    }
}
