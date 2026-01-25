package com.Day2.MedInventory;

import java.time.LocalDate;

@FunctionalInterface
public interface ItemFactory<T> {
    T create(String id, String name, int qty, LocalDate expiry);
}
