package com.Day5LogicalQuestions;

import java.util.List;
import java.util.stream.*;
import java.util.*;

public class FindDuplicate {
public static void main(String[] args) {
	List<Integer> number= List.of(1,2,3,2,4,5,1);
	Set<Integer>set=new HashSet<>();
List<Integer> num=  number.stream()
                  .filter(c->!set.add(c))
                   .collect(Collectors.toList());
			
			System.out.println(num);
			
}
}
