package com.Day5LogicalQuestions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDupli {
public static void main(String[] args) {
	String input = "banana";

    String result = input.chars()                       // Step 1: convert to IntStream
                         .distinct()                    // Step 2: keep only unique characters
                         .mapToObj(c -> String.valueOf((char) c)) // Step 3: convert int to char then to String
                         .collect(Collectors.joining()); // Step 4: join characters back into string

    System.out.println(result);
	
}
}
