package com.bvan.oop.lesson7.generics.format;

import com.bvan.oop.lesson7.generics.format.Product;

/**
 * @author bvanchuhov
 */
public interface Formatter<T> {

    String format(T elem);
}
