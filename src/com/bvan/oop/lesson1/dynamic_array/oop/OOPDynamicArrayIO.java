package com.bvan.oop.lesson1.dynamic_array.oop;

/**
 * @author bvanchuhov
 */
public class OOPDynamicArrayIO {

    public static void main(String[] args) {
        System.out.println("OOPDynamicArrayIO");

        DynamicArray elems = readClientElemsFromConsole();
        System.out.println("Your elems: " + elems.toString());
    }

    private static DynamicArray readClientElemsFromConsole() {
        ConsoleScanner consoleScanner = new ConsoleScanner();
        DynamicArray elems = new DynamicArray();

        int n = consoleScanner.readInt();
        while (n != 0) {
            elems.addLastElem(n);
            n = consoleScanner.readInt();
        }
        return elems;
    }
}
