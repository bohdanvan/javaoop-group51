package com.bvan.oop.lesson5.inheritance;

/**
 * @author bvanchuhov
 */
public class Developer extends Person {

    private final String company;

    public Developer(String name, String company) {
        super(name);
        this.company = company;
    }

    public Developer() {
        super();
        this.company = "no company";
    }

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println("Hello, I'm dev " + getName());
        super.sayHello();
        super.sayHello();
        super.sayHello();
    }

    public void writeCode() {
        System.out.println("I write code in " + company);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + getName() + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
