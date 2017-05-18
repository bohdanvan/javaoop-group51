package com.bvan.oop.lesson8.iteration.custom_impl;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author bvanchuhov
 */
public class Array implements Iterable<Integer> {

    private final Integer[] array;

    public Array(Integer[] array) {
        this.array = array;
    }

    public Integer get(int index) {
        return array[index];
    }

    public void set(int index, Integer elem) {
        array[index] = elem;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ArrayIterator();
    }

    class ArrayIterator implements Iterator<Integer> {

        private int currentIndex;

        @Override
        public boolean hasNext() {
            return currentIndex < array.length;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return array[currentIndex++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
