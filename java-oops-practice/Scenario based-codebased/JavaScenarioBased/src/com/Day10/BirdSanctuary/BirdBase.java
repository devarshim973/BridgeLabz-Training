package com.Day10.BirdSanctuary;

public abstract class BirdBase {

    private String birdId;
    private String name;
    private String species;

    public BirdBase(String birdId, String name, String species) {
        this.birdId = birdId;
        this.name = name;
        this.species = species;
    }

    public String getBirdId() {
        return birdId;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void displayInfo() {
        System.out.println("ID: " + birdId +
                ", Name: " + name +
                ", Species: " + species);
    }
}
