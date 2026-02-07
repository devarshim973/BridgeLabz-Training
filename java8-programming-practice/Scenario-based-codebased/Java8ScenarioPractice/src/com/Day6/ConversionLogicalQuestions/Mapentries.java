package com.Day6.ConversionLogicalQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Mapentries {
	public static void main(String[] args) {

        Map<Integer, String> map = Map.of(
            1, "Java",
            2, "Spring",
            3, "API"
        );
        List<Map.Entry<Integer,String>> values= new ArrayList<>(map.entrySet());
        System.out.println(values);
        
}
}