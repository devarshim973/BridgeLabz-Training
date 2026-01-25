package com.Generics.PersonalizedMealPlanGenerator;

public class MealPlannerExecutionEngine {

    public static void main(String[] args) {

        VegetarianMealPlan vegMeal =
                new VegetarianMealPlan("Veg Bowl", 650);

        VeganMealPlan veganMeal =
                new VeganMealPlan("Vegan Salad", 720);

        KetoMealPlan ketoMeal =
                new KetoMealPlan("Keto Steak", 950);

        HighProteinMealPlan proteinMeal =
                new HighProteinMealPlan("Protein Chicken", 850);

        PersonalizedMeal<VegetarianMealPlan> meal1 =
                new PersonalizedMeal<>(vegMeal);

        PersonalizedMeal<KetoMealPlan> meal2 =
                new PersonalizedMeal<>(ketoMeal);

        MealPlanGeneratorUtil.generateMealPlan(meal1.getMealPlan());
        MealPlanGeneratorUtil.generateMealPlan(veganMeal);
        MealPlanGeneratorUtil.generateMealPlan(meal2.getMealPlan());
        MealPlanGeneratorUtil.generateMealPlan(proteinMeal);
    }
}
