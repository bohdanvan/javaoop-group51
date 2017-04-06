package com.bvan.oop.lesson1.dynamic_array.oop;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class ConsoleScanner {

    private Scanner scanner = new Scanner(System.in);

    public int readInt() {
        System.out.print(">> ");
        while (!scanner.hasNextInt()) {
            scanner.next(); // idle

            System.out.println("Sorry, illegal number");
            System.out.print(">> ");
        }
        return scanner.nextInt();
    }
}
