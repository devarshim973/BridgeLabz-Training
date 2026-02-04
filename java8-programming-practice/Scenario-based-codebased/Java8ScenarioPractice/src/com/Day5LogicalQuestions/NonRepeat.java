package com.Day5LogicalQuestions;

import java.util.Optional;

public class NonRepeat {
public static void main(String[] args) {
	String input="programming";
	Optional<Character> ch=input.chars()
			.mapToObj(i->(char)i)
			.filter(c->input.indexOf(c)==input.lastIndexOf(c))
			.findFirst();
	System.out.println(ch);
}
}
