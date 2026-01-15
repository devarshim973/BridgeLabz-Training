package com.Generics.PersonalizedMealPlanGenerator;

class KetoMealPlan implements MealPlanType {

    private String mealName;
    private int calories;

    public KetoMealPlan(String mealName, int calories) {
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
        // Keto meals must be high calorie but low carb (simulated)
        return calories >= 900;
    }
}
