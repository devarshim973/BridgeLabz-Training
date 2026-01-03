package com.StacksandQueues.StockSpanProblem;

public class StockSpanApplication {

    public static void main(String[] args) {

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        StockSpanCalculator calculator = new StockSpanCalculator();
        int[] result = calculator.calculateSpan(prices);

        System.out.println("Stock Prices:");
        for (int price : prices) {
            System.out.print(price + " ");
        }

        System.out.println("\n\nStock Span:");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}

