package com.Day3.StudentSchoolSystem;

import java.util.ArrayList;
import java.util.List;

public class StudentSchoolSystem {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Suresh", 75, 2, 20));
        students.add(new Student(2, "Amit", 35, 5, 17));
        students.add(new Student(3, "Riya", 82, 1, 19));
        students.add(new Student(4, "Sachin", 60, 3, 21));
        
        //welcome
        students.forEach(i->System.out.println("Welcome"+i.getName()));
        
        //checkif-else
        students.forEach(i->System.out.println(i.getName()+(i.getMarks()>=40?"pass":"fail")));
   
        //sort
        students.sort((s1,s2)->s1.getName().compareTo(s2.getName()));
        System.out.println("sort name");
        
       // 4. Sort students by rank using lambda
        students.sort((s1, s2) -> Integer.compare(s1.getRank(), s2.getRank()));
        System.out.println("Sorted by Rank:");
        students.forEach(System.out::println);

        System.out.println("---------------");

        // 5. Display students whose age is above 18
        System.out.println("Students with age above 18:");
        students.stream()
                .filter(s -> s.getAge() > 18)
                .forEach(System.out::println);
    
    }
}