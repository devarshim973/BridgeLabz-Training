package com.Day7.FlashDealz;

import java.util.List;

public class QuickSortDiscountEngine {

    public static void quickSort(List<FlashSaleProduct> products, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(products, low, high);
            quickSort(products, low, pivotIndex - 1);
            quickSort(products, pivotIndex + 1, high);
        }
    }

    private static int partition(List<FlashSaleProduct> products, int low, int high) {

        double pivot = products.get(high).getDiscountPercentage();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (products.get(j).getDiscountPercentage() >= pivot) {
                i++;
                swap(products, i, j);
            }
        }

        swap(products, i + 1, high);
        return i + 1;
    }

    private static void swap(List<FlashSaleProduct> products, int i, int j) {
        FlashSaleProduct temp = products.get(i);
        products.set(i, products.get(j));
        products.set(j, temp);
    }
}
