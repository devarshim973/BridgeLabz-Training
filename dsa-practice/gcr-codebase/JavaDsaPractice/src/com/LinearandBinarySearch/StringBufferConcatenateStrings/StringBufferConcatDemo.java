package com.LinearandBinarySearch.StringBufferConcatenateStrings;

public class StringBufferConcatDemo {

    public static void main(String[] args) {

        String[] words = {"Java", " ", "is", " ", "Powerful"};

        StringArrayConcatenator concatenator =
                new StringArrayConcatenator();

        String result = concatenator.concatenateStrings(words);

        System.out.println("Concatenated String: " + result);
    }
}
