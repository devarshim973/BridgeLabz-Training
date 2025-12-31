package com.Inheritance;

 public class AnimalHierarchyDemo {
    public static void main(String[] args) {

        // Create objects of subclasses
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Kitty", 2);
        Bird bird = new Bird("Tweety", 1);

        // Call makeSound() using polymorphism
        Animal[] animals = {dog, cat, bird};

        System.out.println("Animal Sounds:");
        for (Animal a : animals) {
            a.makeSound(); // overridden method called
        }
    }
}