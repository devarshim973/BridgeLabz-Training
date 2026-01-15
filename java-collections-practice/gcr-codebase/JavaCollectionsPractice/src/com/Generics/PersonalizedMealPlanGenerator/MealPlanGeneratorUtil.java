package com.Generics.PersonalizedMealPlanGenerator;

class MealPlanGeneratorUtil {

    // Generic method with bounded type parameter
    public static <T extends MealPlanType> void generateMealPlan(T meal) {

        System.out.println("Generating Meal Plan...");
        System.out.println("Meal Name: " + meal.getMealName());
        System.out.println("Calories: " + meal.getCalories());

        if (meal.isValidPlan()) {
            System.out.println("Meal Plan Approved ✅");
        } else {
            System.out.println("Meal Plan Rejected ❌");
        }

        System.out.println("--------------------------------");
    }
}
