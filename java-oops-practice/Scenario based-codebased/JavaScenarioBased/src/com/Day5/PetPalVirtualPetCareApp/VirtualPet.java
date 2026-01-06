package com.Day5.PetPalVirtualPetCareApp;

import java.util.Random;

public class VirtualPet {

    protected String name;
    protected String type;
    protected int age;

    // Encapsulated fields
    private int hunger;
    private int energy;
    private String mood;

    // Constructor with random defaults
    public VirtualPet(String name, String type, int age) {
        Random random = new Random();
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = random.nextInt(50) + 30;
        this.energy = random.nextInt(50) + 30;
        updateMood();
    }

    // Protected methods to modify internal state
    protected void changeHunger(int value) {
        hunger += value;
        if (hunger < 0) hunger = 0;
        updateMood();
    }

    protected void changeEnergy(int value) {
        energy += value;
        if (energy > 100) energy = 100;
        updateMood();
    }

    private void updateMood() {
        if (hunger > 70) {
            mood = "Hungry 😿";
        } else if (energy < 30) {
            mood = "Tired 😴";
        } else {
            mood = "Happy 😊";
        }
    }

    public void showStatus() {
        System.out.println(type + " Status -> Hunger: " + hunger +
                ", Energy: " + energy + ", Mood: " + mood);
    }

    // Polymorphic method
    public void makeSound() {
        System.out.println("Pet makes a sound");
    }
}
