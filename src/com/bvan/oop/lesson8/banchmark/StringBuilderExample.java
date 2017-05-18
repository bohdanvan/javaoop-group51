package com.bvan.oop.lesson8.banchmark;

/**
 * @author bvanchuhov
 */
public class StringBuilderExample {

    public static void main(String[] args) {
        String name = "John";
        int age = 25;

        String message1 = "Hello, I'm " + name +
                ", " + age + " years old";

        System.out.println(message1);

        //--------------------

        StringBuilder sb = new StringBuilder()
                .append("Hello, I'm ")
                .append(name)
                .append(", ")
                .append(age)
                .append(" years old");

        String message2 = sb.toString();

        System.out.println(message2);
    }
}
