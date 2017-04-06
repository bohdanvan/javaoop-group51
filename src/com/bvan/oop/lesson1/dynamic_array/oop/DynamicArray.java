package com.bvan.oop.lesson1.dynamic_array.oop;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * @author bvanchuhov
 */
public class DynamicArray {

    private int[] elems = new int[8];
    private int size = 0;

    public void addLastElem(int n) {
        if (size == elems.length) {
            elems = Arrays.copyOf(elems, elems.length * 2);
        }
        elems[size++] = n;
    }

    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < size; i++) {
            String s = String.valueOf(elems[i]);
            joiner.add(s);
        }
        return joiner.toString();
    }
}
