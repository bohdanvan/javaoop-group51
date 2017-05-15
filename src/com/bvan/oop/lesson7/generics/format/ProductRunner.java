package com.bvan.oop.lesson7.generics.format;

/**
 * @author bvanchuhov
 */
public class ProductRunner {

    public static void main(String[] args) {
        Printer<Product> products = new Printer<Product>();
        products.add(new Product("iPhone", 1500));
        products.add(new Product("Lenovo Notebook", 1000));

        products.print(new NameFormatter());
        System.out.println();
        products.print(new ToStringFormatter<Product>());
    }
}
