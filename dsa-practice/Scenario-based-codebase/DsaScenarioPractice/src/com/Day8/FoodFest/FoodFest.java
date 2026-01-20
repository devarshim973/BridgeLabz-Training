package com.Day8.FoodFest;

import java.util.ArrayList;
import java.util.List;

class FoodFest {

    // Stall class
    static class Stall {
        String stallName;
        int footfall;

        Stall(String stallName, int footfall) {
            this.stallName = stallName;
            this.footfall = footfall;
        }
    }

    // Merge Sort
    public static void mergeSort(List<Stall> stalls) {
        if (stalls.size() <= 1)
            return;

        int mid = stalls.size() / 2;

        List<Stall> left = new ArrayList<>(stalls.subList(0, mid));
        List<Stall> right = new ArrayList<>(stalls.subList(mid, stalls.size()));

        mergeSort(left);
        mergeSort(right);

        merge(stalls, left, right);
    }

    // Merge two sorted lists (Stable Merge)
    private static void merge(List<Stall> result, List<Stall> left, List<Stall> right) {

        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).footfall <= right.get(j).footfall) {
                result.set(k++, left.get(i++)); // stability maintained
            } else {
                result.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            result.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            result.set(k++, right.get(j++));
        }
    }

    // Display stalls
    public static void display(List<Stall> stalls) {
        for (Stall s : stalls) {
            System.out.println(s.stallName + " -> " + s.footfall);
        }
    }

    public static void main(String[] args) {

        // Zone-wise sorted stall data
        List<Stall> stalls = new ArrayList<>();

        stalls.add(new Stall("BurgerZone", 120));
        stalls.add(new Stall("PizzaHub", 150));
        stalls.add(new Stall("TacoTreat", 150)); // equal footfall
        stalls.add(new Stall("NoodleNest", 200));
        stalls.add(new Stall("SweetCorner", 250));

        System.out.println("Before Sorting:");
        display(stalls);

        mergeSort(stalls);

        System.out.println("\nAfter Merge Sort (Master List):");
        display(stalls);
    }
}
