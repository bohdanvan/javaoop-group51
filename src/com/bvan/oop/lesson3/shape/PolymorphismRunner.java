package com.bvan.oop.lesson3.shape;

/**
 * @author bvanchuhov
 */
public class PolymorphismRunner {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.0, 10.0);
        Shape shape1 = rectangle;
        Shape shape2 = new Rectangle(10.0, 20.0);

        if (shape1 instanceof Circle) {
            Circle circle = (Circle) shape1;
            System.out.println(circle.getRadius());
        }

        printInfo(shape1);
        printInfo(shape2);
        printInfo(new Square(10.0));
    }

    private static void printInfo(Shape shape) {
        System.out.println("S = " + shape.getArea());
        System.out.println("P = " + shape.getPerimeter());
        System.out.println();
    }
}
