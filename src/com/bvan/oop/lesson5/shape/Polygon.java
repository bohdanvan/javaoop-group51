package com.bvan.oop.lesson5.shape;

import java.util.List;

/**
 * @author bvanchuhov
 */
public abstract class Polygon implements Shape {

    @Override
    public double getPerimeter() {
        double perimeter = 0;
        for (Double side : getSides()) {
            perimeter += side;
        }
        return perimeter;
    }

    protected abstract List<Double> getSides();
}
