package com.Day2.DealTracker;

import java.time.LocalDate;
import java.util.*;

public class DealTracker<T extends Promotion> {

    private Map<String, T> dealMap = new HashMap<>();
    private Set<String> dealCodes = new HashSet<>();

    public void addDeal(T deal) {

        if (deal.getValidTill().isBefore(LocalDate.now())) {
            System.out.println("❌ Expired Deal Skipped: " + deal.getDealCode());
            return;
        }

        if (!dealCodes.add(deal.getDealCode())) {
            System.out.println("⚠️ Duplicate Deal Skipped: " + deal.getDealCode());
            return;
        }

        dealMap.put(deal.getDealCode(), deal);
    }

    public List<T> sortByDiscount() {

        List<T> deals = new ArrayList<>(dealMap.values());

        deals.sort(Comparator.comparingInt(
                Promotion::getDiscountPercentage).reversed());

        return deals;
    }

    public Map<String, T> getAllDeals() {
        return dealMap;
    }
}
