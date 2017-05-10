package com.bvan.oop.lesson6.enum_example.formatter;

import com.bvan.oop.common.Mutable;
import com.bvan.oop.lesson4.format.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
@Mutable
public class Products {

    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void print(Formatter formatter) {
        for (Product product : products) {
            String s = formatter.format(product);
            System.out.println(s);
        }
    }
}
