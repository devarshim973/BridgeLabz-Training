package com.Inheritance;

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    // Unique behavior
    @Override
    void makeSound() {
        System.out.println(name + " says: Chirp Chirp!");
    }
}
