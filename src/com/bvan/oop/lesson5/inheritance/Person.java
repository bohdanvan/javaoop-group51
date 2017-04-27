package com.bvan.oop.lesson5.inheritance;

/**
 * @author bvanchuhov
 */
public class Person {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
        this("undefined");
    }

    public void sayHello() {
        System.out.println("Hello, I'm " + name);
    }

    protected String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
