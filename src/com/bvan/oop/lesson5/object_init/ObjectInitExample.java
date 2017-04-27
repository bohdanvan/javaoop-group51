package com.bvan.oop.lesson5.object_init;

/**
 * @author bvanchuhov
 */
public class ObjectInitExample {

    public static void main(String[] args) {
        System.out.println("Hello");

        new A();
        new A();
        new A();
    }
}

class A {

    private static int staticX = initStaticX();

    private static int initStaticX() {
        System.out.println("STATIC INIT FIELD");
        return 1;
    }

    static {
        System.out.println("STATIC BLOCK");
    }

    {
        System.out.println("Init block");
    }

    private int x = initX();

    private int initX() {
        System.out.println("Init field");
        return 10;
    }

    public A() {
        System.out.println("Constructor: x = " + x);
    }
}
