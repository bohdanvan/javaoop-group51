package com.bvan.oop.lesson8.iteration.products;

import com.bvan.oop.common.Product;

/**
 * @author bvanchuhov
 */
public class ProductRunner {

    public static void main(String[] args) {
        Products products = new Products();
        products.add(new Product("iPhone", 1500));
        products.add(new Product("Lenovo Notebook", 1000));

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
