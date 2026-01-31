package com.FunctionalInterfaces.StaticMethodsInterfaces.DateFormatUtility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface DateFormatUtils {

    // Default invoice date format
    static String formatISO(LocalDate date) {
        return date.format(DateTimeFormatter.ISO_DATE);
    }

    // Invoice display format (dd-MM-yyyy)
    static String formatForInvoice(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    // US format (MM/dd/yyyy)
    static String formatUS(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
    }

    // Custom format
    static String formatCustom(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
}

