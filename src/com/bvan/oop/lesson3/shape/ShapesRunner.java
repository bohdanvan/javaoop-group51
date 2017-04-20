package com.bvan.oop.lesson3.shape;

/**
 * @author bvanchuhov
 */
public class ShapesRunner {

    public static void main(String[] args) {
        Shapes shapes = new Shapes();

        shapes.add(new Rectangle(10.0, 20.0));
        shapes.add(new Circle(10.0));
        shapes.add(new Square(30.0));

        double shapesArea = shapes.getArea();
        System.out.println("shapesArea = " + shapesArea);

        System.out.println(shapes);
    }
}
