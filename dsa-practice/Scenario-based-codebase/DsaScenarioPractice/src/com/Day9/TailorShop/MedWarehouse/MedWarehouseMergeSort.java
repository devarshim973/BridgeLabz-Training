package com.Day9.TailorShop.MedWarehouse;

class MedWarehouseMergeSort {

    // Medicine class
    static class Medicine {
        int medicineId;
        String medicineName;
        int expiryDays; // days remaining to expiry

        Medicine(int medicineId, String medicineName, int expiryDays) {
            this.medicineId = medicineId;
            this.medicineName = medicineName;
            this.expiryDays = expiryDays;
        }

        void displayMedicine() {
            System.out.println(
                "ID: " + medicineId +
                ", Name: " + medicineName +
                ", Expiry in: " + expiryDays + " days"
            );
        }
    }

    // Merge Sort method
    static void mergeSort(Medicine[] medicines, int left, int right) {
        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(medicines, left, mid);
            mergeSort(medicines, mid + 1, right);

            merge(medicines, left, mid, right);
        }
    }

    // Merge two sorted subarrays
    static void merge(Medicine[] medicines, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Medicine[] leftArray = new Medicine[n1];
        Medicine[] rightArray = new Medicine[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = medicines[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = medicines[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i].expiryDays <= rightArray[j].expiryDays) {
                medicines[k] = leftArray[i];
                i++;
            } else {
                medicines[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            medicines[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            medicines[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        Medicine[] medicines = {
            new Medicine(201, "Paracetamol", 120),
            new Medicine(202, "Insulin", 30),
            new Medicine(203, "Antibiotic", 90),
            new Medicine(204, "Cough Syrup", 20),
            new Medicine(205, "Vitamin D", 60)
        };

        System.out.println("Medicines BEFORE sorting:");
        for (Medicine medicine : medicines) {
            medicine.displayMedicine();
        }

        mergeSort(medicines, 0, medicines.length - 1);

        System.out.println("\nMedicines AFTER sorting by expiry:");
        for (Medicine medicine : medicines) {
            medicine.displayMedicine();
        }

        System.out.println("\n⚠ Medicines nearing expiry (≤ 30 days):");
        for (Medicine medicine : medicines) {
            if (medicine.expiryDays <= 30) {
                medicine.displayMedicine();
            }
        }
    }
}
