package com.bvan.oop.lesson12.multithreading;

/**
 * @author bvanchuhov
 */
public class ThreadJoiningExample {

    public static void main(String[] args) {
        Thread thread = new Thread(new Drinker());
        thread.start();

        try {
            thread.join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ThreadUtils.println("Bar is closed");
    }
}
