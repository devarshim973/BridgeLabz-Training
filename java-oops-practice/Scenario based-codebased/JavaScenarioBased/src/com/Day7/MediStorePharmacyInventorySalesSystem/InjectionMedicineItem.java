package com.Day7.MediStorePharmacyInventorySalesSystem;

import java.time.LocalDate;

class InjectionMedicineItem extends BaseMedicineProduct {

    public InjectionMedicineItem(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    public InjectionMedicineItem(String name, double price,
                                 LocalDate expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    @Override
    public boolean checkExpiry() {
        // Injections expire 2 months earlier
        return LocalDate.now().isAfter(getExpiryDate().minusMonths(2));
    }
}
