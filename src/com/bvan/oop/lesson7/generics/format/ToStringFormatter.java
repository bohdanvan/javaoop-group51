package com.bvan.oop.lesson7.generics.format;

/**
 * @author bvanchuhov
 */
public class ToStringFormatter<T> implements Formatter<T> {

    @Override
    public String format(T elem) {
        return elem.toString();
    }
}
