package com.LinearandBinarySearch.BinarySearchFindElementArray;

public class PeakElementBinaryFinder {

    public int findPeakIndex(int[] numbers) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (numbers[mid] < numbers[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
