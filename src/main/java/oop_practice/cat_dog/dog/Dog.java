package oop_practice.cat_dog.dog;


import oop_practice.cat_dog.animal.Animal;

public class Dog extends Animal {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("I'am a Dog. My name is " + name + ". Gav");
    }
}