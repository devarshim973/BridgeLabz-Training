package com.Generics.PersonalizedMealPlanGenerator;

class VeganMealPlan implements MealPlanType {

    private String mealName;
    private int calories;

    public VeganMealPlan(String mealName, int calories) {
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
        // Vegan meals must be under 700 calories
        return calories <= 700;
    }
}
