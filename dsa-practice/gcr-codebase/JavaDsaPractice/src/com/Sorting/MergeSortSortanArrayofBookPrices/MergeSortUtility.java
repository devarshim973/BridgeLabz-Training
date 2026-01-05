package com.Sorting.MergeSortSortanArrayofBookPrices;

public class MergeSortUtility {

    public static void sortAscending(double[] prices) {
        if (prices == null || prices.length < 2) {
            return;
        }
        mergeSort(prices, 0, prices.length - 1);
    }

    private static void mergeSort(double[] prices, int left, int right) {
        if (left < right) {

            int mid = (left + right) / 2;

            // Divide
            mergeSort(prices, left, mid);
            mergeSort(prices, mid + 1, right);

            // Conquer (Merge)
            merge(prices, left, mid, right);
        }
    }

    private static void merge(double[] prices, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        double[] leftArray = new double[n1];
        double[] rightArray = new double[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = prices[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = prices[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        // Merge sorted arrays
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                prices[k++] = leftArray[i++];
            } else {
                prices[k++] = rightArray[j++];
            }
        }

        // Copy remaining elements
        while (i < n1) {
            prices[k++] = leftArray[i++];
        }

        while (j < n2) {
            prices[k++] = rightArray[j++];
        }
    }
}
