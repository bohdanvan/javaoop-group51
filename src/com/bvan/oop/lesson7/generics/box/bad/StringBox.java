package com.bvan.oop.lesson7.generics.box.bad;

/**
 * @author bvanchuhov
 */
public class StringBox {

    private final String value;

    public StringBox(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "StringBox{" +
                "value='" + value + '\'' +
                '}';
    }
}
