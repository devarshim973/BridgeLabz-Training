package com.day4.ZipZipMart;

public class ZipZipMartReportApplication {

    public static void main(String[] args) {

        SalesTransaction[] transactions = {
            new SalesTransaction("2026-02-01", 1200),
            new SalesTransaction("2026-01-31", 500),
            new SalesTransaction("2026-02-01", 800),
            new SalesTransaction("2026-01-30", 1500),
            new SalesTransaction("2026-01-31", 300)
        };

        System.out.println("Before Sorting:");
        for (SalesTransaction transaction : transactions) {
            transaction.displayTransaction();
        }

        SalesMergeSorter sorter = new SalesMergeSorter();
        sorter.sortByDateAndAmount(transactions);

        System.out.println("\nAfter Sorting (By Date, then Amount):");
        for (SalesTransaction transaction : transactions) {
            transaction.displayTransaction();
        }
    }
}
