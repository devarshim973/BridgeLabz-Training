package com.Day1;

public class OrderProcessingApplication {

    public static void main(String[] args) {

        ProductItem itemOne =
                new ProductItem("Laptop", 50000, 1);

        ProductItem itemTwo =
                new ProductItem("Mouse", 500, 2);

        PurchaseOrder order = new PurchaseOrder();
        order.addProductItem(itemOne);
        order.addProductItem(itemTwo);

        InvoiceDocument invoice = new InvoiceDocument();
        invoice.printInvoice(order);
    }
}
