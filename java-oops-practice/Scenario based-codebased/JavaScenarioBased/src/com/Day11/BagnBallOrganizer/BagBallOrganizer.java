package com.Day11.BagnBallOrganizer;

import java.util.ArrayList;
import java.util.List;

public class BagBallOrganizer {

    private List<ToyBag> bags = new ArrayList<>();

    public void addBag(ToyBag bag) {
        bags.add(bag);
    }

    public void displayAllBags() {
        System.out.println("🧺 All Bags Summary:");
        for (ToyBag bag : bags) {
            System.out.println(
                "Bag ID: " + bag.getId() +
                ", Color: " + bag.getColor() +
                ", Balls: " + bag.getBallCount() +
                "/" + bag.getCapacity()
            );
        }
    }
}
