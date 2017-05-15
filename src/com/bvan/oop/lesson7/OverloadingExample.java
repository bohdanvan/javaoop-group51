package com.bvan.oop.lesson7;

/**
 * @author bvanchuhov
 */
public class OverloadingExample {

    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10.0, 20));
        System.out.println(sum("10", "20"));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static String sum(String a, String b) {
        return a + b;
    }
}
