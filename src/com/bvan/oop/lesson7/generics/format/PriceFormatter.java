package com.bvan.oop.lesson7.generics.format;

/**
 * @author bvanchuhov
 */
public class PriceFormatter implements Formatter<Product> {

    @Override
    public String format(Product elem) {
        return String.valueOf(elem.getPrice());
    }
}
