package com.Day2.DealTracker;

import java.io.FileInputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DealFileParser {

    private static final Pattern CODE_PATTERN =
            Pattern.compile("DealCode:\\s*(\\w+)");
    private static final Pattern DATE_PATTERN =
            Pattern.compile("ValidTill:\\s*(\\d{2}-\\d{2}-\\d{4})");
    private static final Pattern DISCOUNT_PATTERN =
            Pattern.compile("Discount:\\s*(\\d+)%");
    private static final Pattern MIN_PURCHASE_PATTERN =
            Pattern.compile("MinimumPurchase:\\s*(\\d+)");

    public Deal parseDeal(String filePath) throws Exception {

        FileInputStream fis = new FileInputStream(filePath);
        String content = new String(fis.readAllBytes());
        fis.close();

        String dealCode = extract(CODE_PATTERN, content);
        String dateStr = extract(DATE_PATTERN, content);
        int discount = Integer.parseInt(extract(DISCOUNT_PATTERN, content));
        int minPurchase = Integer.parseInt(extract(MIN_PURCHASE_PATTERN, content));

        LocalDate validTill = LocalDate.parse(
                dateStr, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        return new Deal(dealCode, validTill, discount, minPurchase);
    }

    private String extract(Pattern pattern, String text) throws Exception {
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return matcher.group(1);
        }
        throw new Exception("Invalid deal format");
    }
}
