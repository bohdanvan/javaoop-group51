package com.bvan.oop.lesson7.sorting;

/**
 * @author bvanchuhov
 */
public class ComparingExample {

    public static void main(String[] args) {
        System.out.println(Integer.compare(10, 30)); // < 0
        System.out.println(Integer.compare(10, 5)); // > 0
        System.out.println(Integer.compare(10, 10)); // 0
        System.out.println();

        System.out.println("ABCD".compareTo("EFG")); // < 0
        System.out.println("home".compareTo("home")); // 0
        System.out.println("home".compareTo("homework"));
    }
}
