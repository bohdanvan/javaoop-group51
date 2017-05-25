package com.bvan.oop.lesson10.tree;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author bvanchuhov
 */
public class TreeExample {

    public static void main(String[] args) {
        SortedMap<Integer, String> ageToName = new TreeMap<>();

        ageToName.put(30, "Bob"); // O(log N)
        ageToName.put(25, "John");
        ageToName.put(40, "Kostya");
        ageToName.put(20, "Jessy");

        System.out.println(ageToName.get(25)); // O(log N)

        System.out.println(ageToName.firstKey()); // O(log N)
        System.out.println(ageToName.lastKey()); // O(log N)

        System.out.println(ageToName.subMap(23, 33));

        System.out.println(ageToName);
    }
}
