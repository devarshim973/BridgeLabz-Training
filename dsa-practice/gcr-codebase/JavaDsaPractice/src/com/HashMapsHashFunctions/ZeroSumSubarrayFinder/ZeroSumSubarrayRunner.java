package com.HashMapsHashFunctions.ZeroSumSubarrayFinder;

public class ZeroSumSubarrayRunner {

    public static void main(String[] args) {

        int[] array = {3, 4, -7, 3, 1, 3, 1, -4};

        ZeroSumSubarrayFinder finder = new ZeroSumSubarrayFinder();

        System.out.println("Zero-sum subarrays are:");
        finder.findZeroSumSubarrays(array);
    }
}
