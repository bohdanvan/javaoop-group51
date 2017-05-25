package com.bvan.oop.lesson10.io;

import com.bvan.oop.common.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class IOExample {

    private static final String CSV_DELIMITER = ";";

    public static void main(String[] args) {
        try {
            String fileName = "files/products.csv";
            List<Product> products = readProductsFromFile(fileName);
            System.out.println(products);
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, file not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Sorry, IO error: " + e.getMessage());
        } catch (IllegalFormatException e) {
            System.out.println("Sorry, illegal format: " + e.getMessage());
        }
    }

    /**
     * @throws FileNotFoundException
     * @throws IOException
     * @throws IllegalFormatException
     */
    private static Product readProductFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return readProduct(reader);
        }
    }

    /**
     * @throws FileNotFoundException
     * @throws IOException
     * @throws IllegalFormatException
     */
    private static List<Product> readProductsFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return readProducts(reader);
        }
    }

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    private static List<Product> readProducts(BufferedReader reader) throws IOException {
        List<Product> products = new ArrayList<>();

        String line;
        while ((line = reader.readLine()) != null) {
            Product product = parseProduct(line);
            products.add(product);
        }
        return products;
    }

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    private static Product readProduct(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        return parseProduct(line);
    }

    /**
     * @throws IllegalFormatException
     */
    private static Product parseProduct(String s) {
        String[] tokens = s.split(CSV_DELIMITER);

        if (tokens.length < 2) {
            throw new IllegalFormatException("should be at least 2 values: " + s);
        }
        if (!isInt(tokens[1])) {
            throw new IllegalFormatException("illegal price: " + tokens[1]);
        }

        String name = tokens[0];
        int price = Integer.parseInt(tokens[1]);

        return new Product(name, price);
    }

    private static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
