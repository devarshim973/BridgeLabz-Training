package com.Day5LogicalQuestions;

public class RemoveNonAlphanumeric {

    public static void main(String[] args) {

        String input = "ja@va#8!!";

        // Replace all non-alphanumeric characters with empty string
        String result = input.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println(result);
    }
}
