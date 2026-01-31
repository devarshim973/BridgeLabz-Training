package com.StreamAPI.forEachMethod.StockPriceLogger;

import java.util.*;

public class StockPriceLogger {

    public static void main(String[] args) {

        List<StockPrice> liveFeed = Arrays.asList(
            new StockPrice("TCS", 3890.50),
            new StockPrice("INFY", 1642.75),
            new StockPrice("RELIANCE", 2950.30),
            new StockPrice("HDFC", 1588.90)
        );

        // display all stock price updates
        liveFeed.stream()
                .forEach(System.out::println);
    }
}
