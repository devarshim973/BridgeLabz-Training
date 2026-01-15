package com.Generics.SmartWarehouseManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class StorageUnit<T extends WarehouseItem> {

    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}
