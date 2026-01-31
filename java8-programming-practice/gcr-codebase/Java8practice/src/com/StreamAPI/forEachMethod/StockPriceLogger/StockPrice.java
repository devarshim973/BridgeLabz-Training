package com.StreamAPI.forEachMethod.StockPriceLogger;

class StockPrice {
    private String symbol;
    private double price;

    public StockPrice(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }

    @Override
    public String toString() {
        return symbol + " → ₹" + price;
    }
}
