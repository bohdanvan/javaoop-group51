package com.bvan.oop.lesson12.multithreading;

/**
 * @author bvanchuhov
 */
public class Bar {

    public static void main(String[] args) {
        ThreadUtils.println("Bar is opened");

        for (int i = 0; i < 5; i++) {
            new Thread(new Drinker()).start();
        }

        ThreadUtils.println("Bar is closed");
    }
}
