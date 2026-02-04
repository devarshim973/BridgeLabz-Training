package com.Day5LogicalQuestions;

import java.util.List;

public class StringtoUpperCase {
public static void main(String[] args) {
	List<String> word= List.of("java","spring","boot");
	word.stream()
	.map(String::toUpperCase)
	.forEach(System.out::println);
}
}
