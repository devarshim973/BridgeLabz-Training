package com.TimeandSpaceComplexity;

import java.util.HashSet;
import java.util.TreeSet;

class DataStructureSearchComparison {

    // -------- Array Search (O(N)) --------
    static boolean searchInArray(int[] data, int target) {
        for (int value : data) {
            if (value == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int dataSize = 1_000_000;
        int target = dataSize - 1;

        // ---------- Array ----------
        int[] arrayData = new int[dataSize];
        for (int i = 0; i < dataSize; i++) {
            arrayData[i] = i;
        }

        // ---------- HashSet ----------
        HashSet<Integer> hashSetData = new HashSet<>();
        for (int i = 0; i < dataSize; i++) {
            hashSetData.add(i);
        }

        // ---------- TreeSet ----------
        TreeSet<Integer> treeSetData = new TreeSet<>();
        for (int i = 0; i < dataSize; i++) {
            treeSetData.add(i);
        }

        // -------- Array Search Timing --------
        long arrayStart = System.nanoTime();
        searchInArray(arrayData, target);
        long arrayEnd = System.nanoTime();

        // -------- HashSet Search Timing --------
        long hashSetStart = System.nanoTime();
        hashSetData.contains(target);
        long hashSetEnd = System.nanoTime();

        // -------- TreeSet Search Timing --------
        long treeSetStart = System.nanoTime();
        treeSetData.contains(target);
        long treeSetEnd = System.nanoTime();

        System.out.println("Dataset Size: " + dataSize);

        System.out.println("Array Search Time (ms): " +
                (arrayEnd - arrayStart) / 1_000_000.0);

        System.out.println("HashSet Search Time (ms): " +
                (hashSetEnd - hashSetStart) / 1_000_000.0);

        System.out.println("TreeSet Search Time (ms): " +
                (treeSetEnd - treeSetStart) / 1_000_000.0);
    }
}
