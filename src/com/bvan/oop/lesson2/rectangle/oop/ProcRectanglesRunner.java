package com.bvan.oop.lesson2.rectangle.oop;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class ProcRectanglesRunner {

    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(10, 20));
        rectangles.add(new Rectangle(2, 1));

        double sumArea = sumArea(rectangles);
        System.out.println("sumArea = " + sumArea);
    }

    public static double sumArea(ArrayList<Rectangle> rectangles) {
        double sumArea = 0;
        for (Rectangle rectangle : rectangles) {
            sumArea += rectangle.getArea();
        }
        return sumArea;
    }
}
