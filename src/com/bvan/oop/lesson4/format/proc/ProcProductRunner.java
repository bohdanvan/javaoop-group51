package com.bvan.oop.lesson4.format.proc;

import com.bvan.oop.lesson4.format.Product;

/**
 * @author bvanchuhov
 */
public class ProcProductRunner {

    public static void main(String[] args) {
        ProcProducts products = new ProcProducts();
        products.add(new Product("iPhone", 1500));
        products.add(new Product("Lenovo Notebook", 1000));

        products.print("name");
        System.out.println();
        products.print("json");
    }
}
