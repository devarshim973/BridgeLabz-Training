package com.Generics.PersonalizedMealPlanGenerator;

class VegetarianMealPlan implements MealPlanType {

    private String mealName;
    private int calories;

    public VegetarianMealPlan(String mealName, int calories) {
        this.mealName = mealName;
        this.calories = calories;
    }

    @Override
    public String getMealName() {
        return mealName;
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public boolean isValidPlan() {
        // Vegetarian meals must be under 800 calories
        return calories <= 800;
    }
}
