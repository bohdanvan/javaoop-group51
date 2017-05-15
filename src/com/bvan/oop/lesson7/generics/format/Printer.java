package com.bvan.oop.lesson7.generics.format;

import com.bvan.oop.common.Mutable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
@Mutable
public class Printer<T> {

    private final List<T> products = new ArrayList<>();

    public void add(T product) {
        products.add(product);
    }

    public void print(Formatter formatter) {
        for (T product : products) {
            String s = formatter.format(product);
            System.out.println(s);
        }
    }
}
