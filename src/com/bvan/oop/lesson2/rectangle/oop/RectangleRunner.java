package com.bvan.oop.lesson2.rectangle.oop;

/**
 * @author bvanchuhov
 */
public class RectangleRunner {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.0, 20.0);
        rectangle = rectangle.changeWidth(30);

        System.out.println("width = " + rectangle.getWidth());
        System.out.println("height = " + rectangle.getHeight());
        System.out.println("perimeter = " + rectangle.getPerimeter());
        System.out.println("area = " + rectangle.getArea());

        System.out.println("Rectangle = " + rectangle);
    }
}
