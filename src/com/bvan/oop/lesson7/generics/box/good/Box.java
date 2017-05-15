package com.bvan.oop.lesson7.generics.box.good;

import com.bvan.oop.lesson7.generics.box.Cat;
import com.bvan.oop.lesson7.generics.box.Dog;

import java.io.Serializable;

/**
 * @author bvanchuhov
 */
public class Box<T> {

    private final T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Box{" +
                "value='" + value + '\'' +
                '}';
    }
}
