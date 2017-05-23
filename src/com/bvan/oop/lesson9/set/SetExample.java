package com.bvan.oop.lesson9.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author bvanchuhov
 */
public class SetExample {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("John");
        names.add("John");
        names.add("John");
        names.add("Jessy");
        names.add("Bob");
        names.add("Bob");
        names.add("Bob");
        names.add("John");
        names.add("Bob");
        names.add("Bob");
        names.add("Jessy");
        names.add("Jessy");
        names.add("Jessy");

        System.out.println(names);
    }
}
