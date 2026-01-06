package com.Day5.PetPalVirtualPetCareApp;

public class PetPalApplication {

    public static void main(String[] args) {

        VirtualPet dog = new DogPet("Buddy", 3);
        VirtualPet cat = new CatPet("Whiskers", 2);
        VirtualPet bird = new BirdPet("Sky", 1);

        PetInteractable dogAction = (PetInteractable) dog;
        PetInteractable catAction = (PetInteractable) cat;
        PetInteractable birdAction = (PetInteractable) bird;

        dog.makeSound();
        dogAction.feed();
        dogAction.play();
        dogAction.sleep();
        dog.showStatus();

        System.out.println();

        cat.makeSound();
        catAction.feed();
        catAction.play();
        cat.showStatus();

        System.out.println();

        bird.makeSound();
        birdAction.play();
        bird.showStatus();
    }
}
