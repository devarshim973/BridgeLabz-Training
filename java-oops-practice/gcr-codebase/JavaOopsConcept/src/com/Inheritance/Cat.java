package com.Inheritance;

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    // Unique behavior
    @Override
    void makeSound() {
        System.out.println(name + " says: Meow Meow!");
    }
}