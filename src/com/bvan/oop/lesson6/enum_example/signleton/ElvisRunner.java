package com.bvan.oop.lesson6.enum_example.signleton;

/**
 * @author bvanchuhov
 */
public class ElvisRunner {

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.iAmKing();
    }
}
