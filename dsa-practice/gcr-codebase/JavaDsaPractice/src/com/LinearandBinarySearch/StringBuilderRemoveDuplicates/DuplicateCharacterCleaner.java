package com.LinearandBinarySearch.StringBuilderRemoveDuplicates;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacterCleaner {

    public String removeDuplicates(String input) {

        StringBuilder builder = new StringBuilder();
        Set<Character> seenCharacters = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {

            char currentChar = input.charAt(i);

            if (!seenCharacters.contains(currentChar)) {
                seenCharacters.add(currentChar);
                builder.append(currentChar);
            }
        }

        return builder.toString();
    }
}
