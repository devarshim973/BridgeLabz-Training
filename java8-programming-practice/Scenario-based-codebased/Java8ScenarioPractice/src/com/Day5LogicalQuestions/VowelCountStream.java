package com.Day5LogicalQuestions;

public class VowelCountStream {

	public static void main(String[] args) {
		String input= "programming";
		
		long count= input.toLowerCase()
				.chars()
				.filter(i->"aeiou".indexOf(i)!=-1)
				.count();
		System.out.println(count);
	}
}
