package com.Day5.PetPalVirtualPetCareApp;

public class DogPet extends VirtualPet implements PetInteractable {

    public DogPet(String name, int age) {
        super(name, "Dog", age);
    }

    @Override
    public void feed() {
        changeHunger(-20);
        System.out.println("Dog is eating 🍖");
    }

    @Override
    public void play() {
        changeEnergy(-15);
        System.out.println("Dog is playing fetch 🐕");
    }

    @Override
    public void sleep() {
        changeEnergy(+30);
        System.out.println("Dog is sleeping 😴");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof! 🐶");
    }
}
