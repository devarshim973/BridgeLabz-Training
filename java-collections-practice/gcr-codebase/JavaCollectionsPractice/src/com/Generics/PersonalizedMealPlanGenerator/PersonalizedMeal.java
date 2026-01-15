package com.Generics.PersonalizedMealPlanGenerator;

//Generic class restricted to MealPlanType only
class PersonalizedMeal<T extends MealPlanType> {

 private T mealPlan;

 public PersonalizedMeal(T mealPlan) {
     this.mealPlan = mealPlan;
 }

 public T getMealPlan() {
     return mealPlan;
 }
}
