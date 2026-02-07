package com.Day6.ConversionLogicalQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapKeyvalue {
	public static void main(String[] args) {

        Map<Integer, String> map = Map.of(
            1, "Java",
            2, "Spring",
            3, "API"
        );
        List<String> list= map.entrySet()
        		.stream()
        		.map(i->i.getKey()+" "+i.getValue())
        		.collect(Collectors.toList());
        System.out.println(list);
        
}
}