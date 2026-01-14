package com.Day10.BirdSanctuary;

public class DuckBird extends BirdBase implements Flyable, Swimmable {

    public DuckBird(String id, String name) {
        super(id, name, "Duck");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying short distances.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming in the pond.");
    }
}
