package com.Day5LogicalQuestions;

public class Alphabet {
	public static void main(String[] args) {

        String input = "java8stream2025";

        // Replace all non-alphanumeric characters with empty string
        String result = input.replaceAll("[^a-zA-Z]", "");

        System.out.println(result);
}
}