package com.Day6.ConversionLogicalQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MaptoSorted {
	public static void main(String[] args) {

        Map< String,Integer> map = Map.of(
        		"Java", 10,
                "Spring", 30,
                "API", 15
        );
      
        List<Map.Entry<String,Integer>> list= map.entrySet()
        		.stream()
        		.filter(i->i.getValue()%2==0)
        		.collect(Collectors.toList());
        System.out.println(list);
        
}
}