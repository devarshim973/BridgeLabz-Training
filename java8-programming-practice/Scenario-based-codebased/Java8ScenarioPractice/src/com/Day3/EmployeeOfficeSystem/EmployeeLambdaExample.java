package com.Day3.EmployeeOfficeSystem;

import java.util.ArrayList;
import java.util.List;

public class EmployeeLambdaExample {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Amit", 35000, 4));
        employees.add(new Employee(2, "Riya", 28000, 2));
        employees.add(new Employee(3, "Suresh", 50000, 6));
        employees.add(new Employee(4, "Neha", 30000, 3));

        // 1. Calculate bonus
        employees.forEach(e->{
        	if(e.getSalary()>30000) {
        		System.out.println("bonus"+(e.getSalary()*0.10));
        	}
        });
        
        //sort
        employees.sort((e1,e2)->Double.compare(e1.getSalary(),e2.getSalary()));
        employees.forEach(System.out::println);
        
        //eligiblity
        employees.forEach(e->System.out.println(e+"->"+(e.getExperience()>3?"eligible":"not eligible")));
        
        //print detail
        employees.forEach(i->System.out.println(i));
        
        
    }
}