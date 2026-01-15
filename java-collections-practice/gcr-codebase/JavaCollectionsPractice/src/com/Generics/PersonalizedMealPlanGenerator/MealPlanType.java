package com.Generics.PersonalizedMealPlanGenerator;

//Base interface for all meal plans
interface MealPlanType {
 String getMealName();
 int getCalories();
 boolean isValidPlan();
}
