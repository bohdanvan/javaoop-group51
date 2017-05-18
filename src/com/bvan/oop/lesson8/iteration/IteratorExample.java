package com.bvan.oop.lesson8.iteration;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class IteratorExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Bob", "Phil");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String elem = iterator.next();
            System.out.println(elem);
        }

//        for (String name : names) {
//            System.out.println(name);
//        }
    }
}
