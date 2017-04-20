package com.bvan.oop.lesson3.shape;

import com.bvan.oop.common.Mutable;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * @author bvanchuhov
 */
@Mutable
public class Shapes {

    private final List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public double getArea() {
        int sumArea = 0;
        for (Shape shape : shapes) {
            sumArea += shape.getArea();
        }
        return sumArea;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner("\n");
        for (Shape shape : shapes) {
            joiner.add(shape.toString());
        }
        return "Shapes:\n" + joiner;
    }
}
