package com.bvan.oop.lesson7.generics.box.good;

import com.bvan.oop.lesson7.generics.box.Cat;

/**
 * @author bvanchuhov
 */
public class BoxRunner {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Box<Cat> catBox = new Box<Cat>(cat);

        sendBox(catBox);
    }

    private static void sendBox(Box<Cat> catBox) {
        Cat cat = catBox.getValue();
        cat.meow();
    }
}
