package com.bvan.oop.lesson7.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class GenericsSample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("John");
        names.add("Bob");

        System.out.println(names);
    }
}
