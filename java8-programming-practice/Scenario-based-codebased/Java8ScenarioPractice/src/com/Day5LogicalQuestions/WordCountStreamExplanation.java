package com.Day5LogicalQuestions;

import java.util.Arrays;

public class WordCountStreamExplanation {
  public static void main(String[] args) {
	  String input= "Java is very powerful";
	  
	  long count= Arrays.stream(
			  input.trim().split("\\s+"))
			  .count();
	  System.out.println(count);
			  
			  
  }
}
