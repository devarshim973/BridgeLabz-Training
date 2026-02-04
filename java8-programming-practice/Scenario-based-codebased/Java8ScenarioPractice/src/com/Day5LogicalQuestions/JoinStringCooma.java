package com.Day5LogicalQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class JoinStringCooma {
	public static void main(String[] args) {
		List<String> word=List.of("Java","Spring","Boot");
	String sum=	word.stream()
		.collect(Collectors.joining(","));
		System.out.println(sum);
		
}
}