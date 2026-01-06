package com.Day5.PetPalVirtualPetCareApp;

public class CatPet extends VirtualPet implements PetInteractable {

    public CatPet(String name, int age) {
        super(name, "Cat", age);
    }

    @Override
    public void feed() {
        changeHunger(-15);
        System.out.println("Cat is eating 🐟");
    }

    @Override
    public void play() {
        changeEnergy(-10);
        System.out.println("Cat is chasing a toy 🐱");
    }

    @Override
    public void sleep() {
        changeEnergy(+25);
        System.out.println("Cat is napping 💤");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow! 🐱");
    }
}

