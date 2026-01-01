package com.Day1;

import java.util.ArrayList;
import java.util.List;

class PurchaseOrder {

    private List<ProductItem> productList;

    public PurchaseOrder() {
        productList = new ArrayList<>();
    }

    public void addProductItem(ProductItem item) {
        productList.add(item);
    }

    public List<ProductItem> getProductList() {
        return productList;
    }
}

