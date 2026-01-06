package com.Day5.PetPalVirtualPetCareApp;

public class BirdPet extends VirtualPet implements PetInteractable {

    public BirdPet(String name, int age) {
        super(name, "Bird", age);
    }

    @Override
    public void feed() {
        changeHunger(-10);
        System.out.println("Bird is pecking seeds 🌾");
    }

    @Override
    public void play() {
        changeEnergy(-8);
        System.out.println("Bird is flying 🕊️");
    }

    @Override
    public void sleep() {
        changeEnergy(+20);
        System.out.println("Bird is resting 💤");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird says: Chirp! 🐦");
    }
}

