package com.bvan.oop.lesson4.format.oop;

import com.bvan.oop.lesson4.format.Product;

/**
 * @author bvanchuhov
 */
public class ProductRunner {

    public static void main(String[] args) {
        Products products = new Products();
        products.add(new Product("iPhone", 1500));
        products.add(new Product("Lenovo Notebook", 1000));

        products.print(new NameFormatter());
        System.out.println();
        products.print(new CsvFormatter());
        System.out.println();
        products.print(new CsvFormatter(";"));
    }
}
