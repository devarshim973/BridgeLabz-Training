package com.LinearandBinarySearch.StringBuilderRemoveDuplicates;

public class StringDuplicateRemovalDemo {

    public static void main(String[] args) {

        String input = "programming";

        DuplicateCharacterCleaner cleaner =
                new DuplicateCharacterCleaner();

        String result = cleaner.removeDuplicates(input);

        System.out.println("Original String: " + input);
        System.out.println("Without Duplicates: " + result);
    }
}
