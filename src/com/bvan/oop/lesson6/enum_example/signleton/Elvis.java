package com.bvan.oop.lesson6.enum_example.signleton;

/**
 * @author bvanchuhov
 */
public enum Elvis {
    INSTANCE;

    public void iAmKing() {
        System.out.println("Yes, I'm king");
    }
}
