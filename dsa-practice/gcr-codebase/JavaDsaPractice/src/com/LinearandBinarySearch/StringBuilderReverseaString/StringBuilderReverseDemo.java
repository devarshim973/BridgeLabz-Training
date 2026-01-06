package com.LinearandBinarySearch.StringBuilderReverseaString;

public class StringBuilderReverseDemo {

    public static void main(String[] args) {

        String input = "hello";

        StringReversalUtility utility =
                new StringReversalUtility();

        String result = utility.reverseText(input);

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + result);
    }
}
