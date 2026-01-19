package com.Day7.FlashDealz;

import java.util.List;

public class FlashDealzService {

    public static void sortProductsByDiscount(List<FlashSaleProduct> products) {
        QuickSortDiscountEngine.quickSort(products, 0, products.size() - 1);
    }

    public static void displayTopDeals(List<FlashSaleProduct> products, int topN) {
        System.out.println("🔥 Top " + topN + " Flash Deals:");
        for (int i = 0; i < topN && i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }
}
