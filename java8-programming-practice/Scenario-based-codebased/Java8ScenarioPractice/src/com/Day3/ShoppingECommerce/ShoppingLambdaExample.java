package com.Day3.ShoppingECommerce;

import java.util.ArrayList;
import java.util.List;

public class ShoppingLambdaExample {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 60000));
        products.add(new Product(2, "Headphones", 1500));
        products.add(new Product(3, "Mouse", 400));
        products.add(new Product(4, "Keyboard", 1200));
        
        //discount
        products.forEach(p->{
        	double discount=p.getPrice()*0.90;
        	p.setPrice(discount);
        	System.out.println(p);
        });
        
        //sort
        products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        products.forEach(System.out::println);
        
        //eligible
        products.forEach(i->{
        	if(i.getPrice()>500) {
        		System.out.println(i.getPrice()+(i.getPrice()>500?"free Delivery":"not free"));
        	}
        });
}
}