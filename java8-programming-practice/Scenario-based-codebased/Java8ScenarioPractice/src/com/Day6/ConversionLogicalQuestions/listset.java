package com.Day6.ConversionLogicalQuestions;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class listset {
	public static void main(String[] args) {

        List<Integer> list = List.of(10, 15, 20, 25, 30);
        Set<Integer> set=list.stream()
        		.map(i->i*i)
        		.collect(Collectors.toSet());
        System.out.println(set);

}
	
}