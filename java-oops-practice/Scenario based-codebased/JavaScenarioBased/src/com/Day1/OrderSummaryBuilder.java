package com.Day1;

import java.util.List;

class OrderSummaryBuilder {

    public String buildSummary(List<StoreBook> books) {

        StringBuilder summary = new StringBuilder();
        summary.append("Order Summary\n");

        for (StoreBook book : books) {
            summary.append(book.getTitle())
                   .append(" - ₹")
                   .append(book.getPrice())
                   .append("\n");
        }

        return summary.toString();
    }
}
