package com.Day10.BirdSanctuary;

public class PenguinBird extends BirdBase implements Swimmable {

    public PenguinBird(String id, String name) {
        super(id, name, "Penguin");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming swiftly underwater.");
    }
}
