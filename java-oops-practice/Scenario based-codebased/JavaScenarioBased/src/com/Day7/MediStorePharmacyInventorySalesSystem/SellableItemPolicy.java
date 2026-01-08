package com.Day7.MediStorePharmacyInventorySalesSystem;

interface SellableItemPolicy {

    void sellMedicine(int quantity);

    boolean checkExpiry();
}
