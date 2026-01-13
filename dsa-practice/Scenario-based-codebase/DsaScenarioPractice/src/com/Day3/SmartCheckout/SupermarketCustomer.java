package com.Day3.SmartCheckout;

import java.util.ArrayList;
import java.util.List;

public class SupermarketCustomer {

    private String customerName;
    private List<ShoppingItem> itemList = new ArrayList<>();

    public SupermarketCustomer(String customerName) {
        this.customerName = customerName;
    }

    public void addItem(ShoppingItem item) {
        itemList.add(item);
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<ShoppingItem> getItemList() {
        return itemList;
    }
}
