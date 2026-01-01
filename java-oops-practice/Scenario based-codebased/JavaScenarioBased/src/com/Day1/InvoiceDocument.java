package com.Day1;

public class InvoiceDocument {

    public double calculateTotalAmount(PurchaseOrder order) {
        double total = 0;

        for (ProductItem item : order.getProductList()) {
            total += item.getItemTotal();
        }
        return total;
    }

    public void printInvoice(PurchaseOrder order) {
        System.out.println("----- INVOICE -----");

        for (ProductItem item : order.getProductList()) {
            System.out.println(
                item.getProductName() +
                " | Qty: " + item.getQuantity() +
                " | Total: " + item.getItemTotal()
            );
        }

        System.out.println("-------------------");
        System.out.println("Grand Total: " + calculateTotalAmount(order));
    }
}
