package com.LinearandBinarySearch.StringBuilderReverseaString;

public class StringReversalUtility {

    public String reverseText(String input) {

        // Step 1: Create StringBuilder object
        StringBuilder builder = new StringBuilder();

        // Step 2: Append the string
        builder.append(input);

        // Step 3: Reverse the string
        builder.reverse();

        // Step 4: Convert to String and return
        return builder.toString();
    }
}
