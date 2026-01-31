package com.FunctionalInterfaces.StaticMethodsInterfaces.DateFormatUtility;

import java.time.LocalDate;

public class InvoiceGenerator {

    public static void main(String[] args) {

        LocalDate invoiceDate = LocalDate.now();

        System.out.println("ISO Date      : " + DateFormatUtils.formatISO(invoiceDate));
        System.out.println("Invoice Date  : " + DateFormatUtils.formatForInvoice(invoiceDate));
        System.out.println("US Date       : " + DateFormatUtils.formatUS(invoiceDate));
        System.out.println("Custom Date   : " +
                DateFormatUtils.formatCustom(invoiceDate, "dd MMM yyyy"));
    }
}
