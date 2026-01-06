package com.LinearandBinarySearch.BinarySearchFindFirstandLastOccurrence;

public class FirstLastBinaryFinder {

    // Find first occurrence of target
    public int findFirstOccurrence(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                result = mid;
                right = mid - 1; // move left to find first occurrence
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    // Find last occurrence of target
    public int findLastOccurrence(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                result = mid;
                left = mid + 1; // move right to find last occurrence
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
