package com.qa.model;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String move() {
        return "Cat moved";
    }

    @Override
    public String sayHello() {
        return "Hello from cat";
    }

    @Override
    public String toString() {
        return "Cat( " + super.toString() + " )";
    }
}
