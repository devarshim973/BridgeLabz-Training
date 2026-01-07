package com.TimeandSpaceComplexity;

import java.util.Arrays;

class SearchPerformanceComparison {

    // Linear Search: O(N)
    static int performLinearSearch(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search: O(log N)
    static int performBinarySearch(int[] data, int target) {
        int low = 0;
        int high = data.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (data[mid] == target) {
                return mid;
            } else if (data[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int dataSize = 1_000_000;
        int[] dataset = new int[dataSize];

        // Fill dataset
        for (int i = 0; i < dataSize; i++) {
            dataset[i] = i + 1;
        }

        int target = dataSize; // worst case

        // Linear Search Timing
        long linearStart = System.nanoTime();
        performLinearSearch(dataset, target);
        long linearEnd = System.nanoTime();

        // Sort for Binary Search
        Arrays.sort(dataset);

        // Binary Search Timing
        long binaryStart = System.nanoTime();
        performBinarySearch(dataset, target);
        long binaryEnd = System.nanoTime();

        System.out.println("Dataset Size: " + dataSize);
        System.out.println("Linear Search Time (ms): "
                + (linearEnd - linearStart) / 1_000_000.0);
        System.out.println("Binary Search Time (ms): "
                + (binaryEnd - binaryStart) / 1_000_000.0);
    }
}
