package com.HashMapsHashFunctions.LongestConsecutiveSequence;

public class ConsecutiveSequenceApp {

    public static void main(String[] args) {

        int[] array = {100, 4, 200, 1, 3, 2};

        ConsecutiveSequenceFinder finder =
                new ConsecutiveSequenceFinder();

        int result = finder.findLongestConsecutiveSequence(array);

        System.out.println(
            "Longest Consecutive Sequence Length = " + result
        );
    }
}
