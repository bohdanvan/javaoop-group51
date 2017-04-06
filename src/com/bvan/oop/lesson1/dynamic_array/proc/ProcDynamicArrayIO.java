package com.bvan.oop.lesson1.dynamic_array.proc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class ProcDynamicArrayIO {

    public static void main(String[] args) {
        System.out.println("ProcDynamicArrayIO");

        int[] elems = readClientElemsFromConsole();
        System.out.println("Your elems: " + Arrays.toString(elems));
    }

    private static int[] readClientElemsFromConsole() {
        Scanner scanner = new Scanner(System.in);
        int[] elems = new int[8];
        int size = 0;

        int n = readElem(scanner);
        while (n != 0) {
            if (size == elems.length) {
                elems = Arrays.copyOf(elems, elems.length * 2);
            }
            elems[size++] = n;

            n = readElem(scanner);
        }
        return Arrays.copyOf(elems, size);
    }

    private static int readElem(Scanner scanner){
        System.out.print(">> ");
        while (!scanner.hasNextInt()) {
            scanner.next(); // idle

            System.out.println("Sorry, illegal number");
            System.out.print(">> ");
        }
        return scanner.nextInt();
    }
}
