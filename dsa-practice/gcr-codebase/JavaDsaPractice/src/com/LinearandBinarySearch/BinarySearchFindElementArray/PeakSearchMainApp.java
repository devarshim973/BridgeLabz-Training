package com.LinearandBinarySearch.BinarySearchFindElementArray;

public class PeakSearchMainApp {

    public static void main(String[] args) {

        int[] array = { 1, 3, 20, 4, 1, 0 };

        PeakElementBinaryFinder finder =
                new PeakElementBinaryFinder();

        int peakIndex =
                finder.findPeakIndex(array);

        System.out.println(
            "Peak element index: " + peakIndex
        );
        System.out.println(
            "Peak element value: " + array[peakIndex]
        );
    }
}
