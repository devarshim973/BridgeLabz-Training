package com.LinearandBinarySearch.BinarySearchFindFirstandLastOccurrence;

public class FirstLastSearchMainApp {

    public static void main(String[] args) {

        int[] array = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        FirstLastBinaryFinder finder = new FirstLastBinaryFinder();

        int firstIndex = finder.findFirstOccurrence(array, target);
        int lastIndex = finder.findLastOccurrence(array, target);

        System.out.println("First occurrence: " + firstIndex);
        System.out.println("Last occurrence: " + lastIndex);
    }
}

