package com.Day5LogicalQuestions;

import java.util.List;

public class StringLengthList {
public static void main(String[] args) {
	List<String> word=List.of("cat","elephant","dog");
	word.stream()
	.map(String::length)
	.forEach(System.out::println);
}
}
