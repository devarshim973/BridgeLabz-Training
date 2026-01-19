package com.Day7.FlashDealz;

import java.util.ArrayList;
import java.util.List;

public class FlashDealzApplication {

    public static void main(String[] args) {

        List<FlashSaleProduct> products = new ArrayList<>();

        products.add(new FlashSaleProduct(101, "Laptop", 35.5));
        products.add(new FlashSaleProduct(102, "Smartphone", 50.0));
        products.add(new FlashSaleProduct(103, "Headphones", 20.0));
        products.add(new FlashSaleProduct(104, "Smartwatch", 45.0));
        products.add(new FlashSaleProduct(105, "Camera", 30.0));

        FlashDealzService.sortProductsByDiscount(products);
        FlashDealzService.displayTopDeals(products, 3);
    }
}
