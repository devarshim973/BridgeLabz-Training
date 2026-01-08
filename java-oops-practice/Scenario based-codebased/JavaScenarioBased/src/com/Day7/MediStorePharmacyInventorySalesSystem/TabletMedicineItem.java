package com.Day7.MediStorePharmacyInventorySalesSystem;

import java.time.LocalDate;

class TabletMedicineItem extends BaseMedicineProduct {

    public TabletMedicineItem(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    public TabletMedicineItem(String name, double price,
                              LocalDate expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    @Override
    public boolean checkExpiry() {
        // Tablets expire only AFTER expiry date
        return LocalDate.now().isAfter(getExpiryDate());
    }
}
