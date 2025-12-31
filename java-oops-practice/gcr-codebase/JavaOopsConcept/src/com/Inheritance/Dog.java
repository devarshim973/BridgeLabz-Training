package com.Inheritance;

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    // Unique behavior
    @Override
    void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}