package com.qa.model;

public abstract class Animal implements Comparable<Animal> {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String move();

    public abstract String sayHello();

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Animal o) {
        return age - o.getAge();
    }

    @Override
    public String toString() {
        return "Name='" + name + '\'' +
                ", Age=" + age;
    }
}
