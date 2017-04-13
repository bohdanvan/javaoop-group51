package com.bvan.oop.lesson2.rectangle.oop;

/**
 * @author bvanchuhov
 */
public class OOPRectanglesRunner {

    public static void main(String[] args) {
        Rectangles rectangles = new Rectangles();
        rectangles.add(new Rectangle(10, 20));
        rectangles.add(new Rectangle(30, 15));

        System.out.println(rectangles);

        double area = rectangles.getArea();
        System.out.println("area = " + area);

        Rectangles newRectangles = rectangles.findRectanglesWithWidthLessThan(20);

        System.out.println(newRectangles);
    }
}
