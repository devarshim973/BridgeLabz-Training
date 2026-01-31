package com.Collectors.OrderRevenueSummary;

import java.util.*;
import java.util.stream.*;

public class OrderRevenueSummary {

    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
            new Order("O101", "Amit", 2500.0),
            new Order("O102", "Neha", 1800.0),
            new Order("O103", "Amit", 3200.0),
            new Order("O104", "Rahul", 1500.0),
            new Order("O105", "Neha", 2200.0)
        );

        Map<String, Double> revenueByCustomer =
                orders.stream()
                      .collect(Collectors.groupingBy(
                          Order::getCustomerName,
                          Collectors.summingDouble(Order::getOrderTotal)
                      ));

        revenueByCustomer.forEach((customer, total) ->
            System.out.println(customer + " → Total Revenue: ₹" + total)
        );
    }
}
