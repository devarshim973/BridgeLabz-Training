package com.LinearandBinarySearch.StringBufferConcatenateStrings;

public class StringArrayConcatenator {

    public String concatenateStrings(String[] words) {

        // Step 1: Create StringBuffer
        StringBuffer buffer = new StringBuffer();

        // Step 2: Append each string
        for (String word : words) {
            buffer.append(word);
        }

        // Step 3: Convert to String and return
        return buffer.toString();
    }
}

