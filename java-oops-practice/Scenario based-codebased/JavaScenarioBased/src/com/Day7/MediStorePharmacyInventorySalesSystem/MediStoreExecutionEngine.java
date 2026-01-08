package com.Day7.MediStorePharmacyInventorySalesSystem;

import java.time.LocalDate;

class MediStoreExecutionEngine {

    public static void main(String[] args) {

        BaseMedicineProduct tablet =
            new TabletMedicineItem("Paracetamol", 2.0,
                    LocalDate.of(2026, 5, 1));

        BaseMedicineProduct syrup =
            new SyrupMedicineItem("Cough Syrup", 120.0,
                    LocalDate.of(2025, 12, 1), 20);

        BaseMedicineProduct injection =
            new InjectionMedicineItem("Insulin Injection", 500.0,
                    LocalDate.of(2025, 10, 1), 15);

        System.out.println("---- MEDICINE SALES ----");
        tablet.sellMedicine(3);
        syrup.sellMedicine(6);
        injection.sellMedicine(2);

        System.out.println("\n---- STOCK STATUS ----");
        System.out.println(tablet.getName() + " stock: " + tablet.getQuantity());
        System.out.println(syrup.getName() + " stock: " + syrup.getQuantity());
        System.out.println(injection.getName() + " stock: " + injection.getQuantity());
    }
}
