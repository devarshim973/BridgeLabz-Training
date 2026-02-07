package com.Day6.ConversionLogicalQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MaptoList {
	public static void main(String[] args) {

        Map<Integer, String> map = Map.of(
            1, "Java",
            2, "Spring",
            3, "API"
        );
        List<Integer> key= new ArrayList<>(map.keySet());
        System.out.println(key);
        
}
}