package com.Day5LogicalQuestions;

import java.util.List;
import java.util.Optional;

public class FindLongestString {
public static void main(String[] args) {
	List<String> word = List.of("java","microservices","api");
Optional<String> num=	word.stream()
	.max((s1,s2)->Integer.compare(s1.length(), s2.length()));
	System.out.println(num);
}
}
