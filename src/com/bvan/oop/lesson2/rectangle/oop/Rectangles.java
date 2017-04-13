package com.bvan.oop.lesson2.rectangle.oop;

import com.bvan.oop.common.Mutable;

import java.util.ArrayList;
import java.util.StringJoiner;

/**
 * @author bvanchuhov
 */
@Mutable
public class Rectangles {

    private final ArrayList<Rectangle> rectangles = new ArrayList<>();

    public void add(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public double getArea() {
        double sumArea = 0;
        for (Rectangle rectangle : rectangles) {
            sumArea += rectangle.getArea();
        }
        return sumArea;
    }

    public Rectangles findRectanglesWithWidthLessThan(double maxWidth) {
        Rectangles res = new Rectangles();
        for (Rectangle rectangle : rectangles) {
            if (rectangle.getWidth() < maxWidth) {
                res.add(rectangle);
            }
        }
        return res;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner("\n");
        for (Rectangle rectangle : rectangles) {
            joiner.add(rectangle.toString());
        }
        return "Rectangles:\n" + joiner.toString();
    }
}
