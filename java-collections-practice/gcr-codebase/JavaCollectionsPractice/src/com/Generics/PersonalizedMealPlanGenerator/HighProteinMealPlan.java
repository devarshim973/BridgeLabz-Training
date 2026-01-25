package com.Generics.PersonalizedMealPlanGenerator;

class HighProteinMealPlan implements MealPlanType {

    private String mealName;
    private int calories;

    public HighProteinMealPlan(String mealName, int calories) {
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
        // High protein meals should be moderate calories
        return calories >= 600 && calories <= 1000;
    }
}
