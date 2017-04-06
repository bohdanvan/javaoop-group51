package com.bvan.oop.lesson1.dynamic_array.array_list;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class ArrayListIO {

    public static void main(String[] args) {
        System.out.println("ArrayListIO");

        ArrayList<Integer> elems = readClientElemsFromConsole();
        System.out.println("Your elems: " + elems.toString());
    }

    private static ArrayList<Integer> readClientElemsFromConsole() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> elems = new ArrayList<>();

        int n = readElem(scanner);
        while (n != 0) {
            elems.add(n);
            n = readElem(scanner);
        }
        return elems;
    }

    private static int readElem(Scanner scanner) {
        System.out.print(">> ");
        while (!scanner.hasNextInt()) {
            scanner.next(); // idle

            System.out.println("Sorry, illegal number");
            System.out.print(">> ");
        }
        return scanner.nextInt();
    }
}
