package com.qa.model;

public class Rabbit extends Animal{
    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public String move() {
        return "Rabbit moved";
    }

    @Override
    public String sayHello() {
        return "Hello from Rabbit";
    }

    @Override
    public String toString() {
        return "Rabbit( " + super.toString() + " )";
    }
}
