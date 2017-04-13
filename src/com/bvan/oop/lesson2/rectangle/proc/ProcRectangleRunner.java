package com.bvan.oop.lesson2.rectangle.proc;

/**
 * @author bvanchuhov
 */
public class ProcRectangleRunner {

    public static void main(String[] args) {
        ProcRectangle rectangle = new ProcRectangle();
        rectangle.width = 10.0;
        rectangle.height = 20.0;

        System.out.println("width = " + rectangle.width);
        System.out.println("height = " + rectangle.height);
        System.out.println("perimeter = " + ProcRectangleRunner.perimeter(rectangle));
        System.out.println("area = " + ProcRectangleRunner.area(rectangle));
    }

    public static double perimeter(ProcRectangle rectangle) {
        return 2 * (rectangle.width + rectangle.height);
    }

    public static double area(ProcRectangle rectangle) {
        return rectangle.width * rectangle.height;
    }
}
