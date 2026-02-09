
package com.Day5LogicalQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {
public static void main(String[] args) {
	List<String> word= List.of("java","api");
	List<String> reverseword= word.stream()
			.map(i->i.chars()
					.mapToObj(c->String.valueOf((char) c))
					.reduce("",(a,b)->b+a))
			.collect(Collectors.toList());
	System.out.println(reverseword);
	
}
}
