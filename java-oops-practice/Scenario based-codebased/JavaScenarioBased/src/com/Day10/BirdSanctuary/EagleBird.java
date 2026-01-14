package com.Day10.BirdSanctuary;

public class EagleBird extends BirdBase implements Flyable {

    public EagleBird(String id, String name) {
        super(id, name, "Eagle");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is soaring high in the sky.");
    }
}
