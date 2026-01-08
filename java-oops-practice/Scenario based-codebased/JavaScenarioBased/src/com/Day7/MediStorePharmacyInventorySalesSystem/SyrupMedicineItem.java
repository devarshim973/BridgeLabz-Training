package com.Day7.MediStorePharmacyInventorySalesSystem;

import java.time.LocalDate;

class SyrupMedicineItem extends BaseMedicineProduct {

    public SyrupMedicineItem(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    public SyrupMedicineItem(String name, double price,
                             LocalDate expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    @Override
    public boolean checkExpiry() {
        // Liquids expire 1 month earlier
        return LocalDate.now().isAfter(getExpiryDate().minusMonths(1));
    }
}
