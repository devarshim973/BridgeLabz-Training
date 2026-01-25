package com.Day2.DealTracker;

public class DealTrackerApp {

    public static void main(String[] args) {

        try {
            DealFileParser parser = new DealFileParser();
            DealTracker<Deal> tracker = new DealTracker<>();

            Deal deal1 = parser.parseDeal("deal1.txt");
            Deal deal2 = parser.parseDeal("deal2.txt");

            tracker.addDeal(deal1);
            tracker.addDeal(deal2);

            System.out.println("✅ Valid Deals:");
            tracker.getAllDeals().values()
                   .forEach(System.out::println);

            System.out.println("\n🔥 Deals Sorted by Discount:");
            tracker.sortByDiscount().forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
