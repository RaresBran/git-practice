package com.qa.model;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String move() {
        return "Dog moved";
    }

    @Override
    public String sayHello() {
        return "Hello from Dog";
    }

    @Override
    public String toString() {
        return "Dog( " + super.toString() + " )";
    }
}
