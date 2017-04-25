package com.bvan.oop.lesson4.format.proc;

import com.bvan.oop.lesson4.format.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class ProcProducts {

    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void print(String formatType) {
        for (Product product : products) {
            String s = format(product, formatType);
            System.out.println(s);
        }
    }

    private String format(Product product, String formatType) {
        switch (formatType) {
            case "name":
                return nameFormat(product);
            case "price":
                return priceFormat(product);
            case "csv":
                return csvFormat(product);
            case "json":
                return jsonFormat(product);
            default:
                throw new IllegalArgumentException("no such format: " + formatType);
        }
    }

    private String jsonFormat(Product product) {
        return "{ 'name': '" + product.getName() + "', 'price': " + product.getPrice() + " }";
    }

    private String csvFormat(Product product) {
        return nameFormat(product) + "," + product.getPrice();
    }

    private String priceFormat(Product product) {
        return String.valueOf(product.getPrice());
    }

    private String nameFormat(Product product) {
        return product.getName();
    }
}
