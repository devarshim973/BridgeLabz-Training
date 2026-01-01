package com.encapsulationandpolymorphism.OnlineFoodDeliverySystem;

 import java.util.List;

class OrderProcessor {

    public static void processOrder(List<FoodItem> foodItems) {

        double finalAmount = 0;

        for (FoodItem item : foodItems) {

            item.getItemDetails();

            double totalPrice = item.calculateTotalPrice();
            double discount = 0;

            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                discount = discountable.applyDiscount();
                System.out.println(discountable.getDiscountDetails());
            }

            double payable = totalPrice - discount;
            finalAmount += payable;

            System.out.println("Payable Amount: ₹" + payable);
            System.out.println("--------------------------------");
        }

        System.out.println("Final Order Amount: ₹" + finalAmount);
    }
}
