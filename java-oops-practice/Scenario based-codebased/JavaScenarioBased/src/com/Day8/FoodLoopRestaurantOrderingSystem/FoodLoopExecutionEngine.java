package com.Day8.FoodLoopRestaurantOrderingSystem;

import java.util.Arrays;
import java.util.List;

class FoodLoopExecutionEngine {

    public static void main(String[] args) {

        BaseFoodItem item1 =
            new VegFoodItem("Paneer Butter Masala", 250, 5);

        BaseFoodItem item2 =
            new NonVegFoodItem("Chicken Biryani", 350, 3);

        BaseFoodItem item3 =
            new VegFoodItem("Butter Naan", 60, 10);

        List<BaseFoodItem> comboMeal =
            Arrays.asList(item1, item2, item3);

        CustomerFoodOrder order =
            new CustomerFoodOrder(comboMeal);

        System.out.println("---- FOOD ORDER ----");
        order.placeOrder();

        System.out.println("\n---- CANCEL ORDER ----");
        order.cancelOrder();
    }
}
