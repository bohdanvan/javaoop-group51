package com.bvan.oop.lesson7.generics.format;

/**
 * @author bvanchuhov
 */
public class NameFormatter implements Formatter<Product> {

    @Override
    public String format(Product product) {
        return product.getName();
    }
}
