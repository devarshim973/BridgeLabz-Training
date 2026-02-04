package com.Day5LogicalQuestions;

public class OnlyDigit {
	public static void main(String[] args) {

        String input = "AB123XZ9";

        // Replace all non-alphanumeric characters with empty string
        String result = input.replaceAll("[^0-9]", "");

        System.out.println(result);
}
}