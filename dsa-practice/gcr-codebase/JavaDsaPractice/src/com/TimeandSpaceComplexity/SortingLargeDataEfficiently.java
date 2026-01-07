package com.TimeandSpaceComplexity;

import java.util.Random;
import java.util.Arrays;

class SortingEfficiencyComparison {

    // ---------------- Bubble Sort ----------------
    static void bubbleSortAlgorithm(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // ---------------- Merge Sort ----------------
    static void mergeSortAlgorithm(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSortAlgorithm(arr, left, mid);
            mergeSortAlgorithm(arr, mid + 1, right);

            mergeArrays(arr, left, mid, right);
        }
    }

    static void mergeArrays(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        while (i < n1) arr[k++] = leftArr[i++];
        while (j < n2) arr[k++] = rightArr[j++];
    }

    // ---------------- Quick Sort ----------------
    static void quickSortAlgorithm(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSortAlgorithm(arr, low, pivotIndex - 1);
            quickSortAlgorithm(arr, pivotIndex + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // ---------------- Main Method ----------------
    public static void main(String[] args) {

        int dataSize = 10_000;
        int[] originalData = new int[dataSize];
        Random random = new Random();

        for (int i = 0; i < dataSize; i++) {
            originalData[i] = random.nextInt(dataSize);
        }

        int[] bubbleData = Arrays.copyOf(originalData, dataSize);
        int[] mergeData = Arrays.copyOf(originalData, dataSize);
        int[] quickData = Arrays.copyOf(originalData, dataSize);

        // Bubble Sort Timing
        long bubbleStart = System.nanoTime();
        bubbleSortAlgorithm(bubbleData);
        long bubbleEnd = System.nanoTime();

        // Merge Sort Timing
        long mergeStart = System.nanoTime();
        mergeSortAlgorithm(mergeData, 0, mergeData.length - 1);
        long mergeEnd = System.nanoTime();

        // Quick Sort Timing
        long quickStart = System.nanoTime();
        quickSortAlgorithm(quickData, 0, quickData.length - 1);
        long quickEnd = System.nanoTime();

        System.out.println("Dataset Size: " + dataSize);
        System.out.println("Bubble Sort Time (ms): " +
                (bubbleEnd - bubbleStart) / 1_000_000.0);
        System.out.println("Merge Sort Time (ms): " +
                (mergeEnd - mergeStart) / 1_000_000.0);
        System.out.println("Quick Sort Time (ms): " +
                (quickEnd - quickStart) / 1_000_000.0);
    }
}
