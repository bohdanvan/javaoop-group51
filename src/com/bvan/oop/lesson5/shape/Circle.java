package com.bvan.oop.lesson5.shape;

import com.bvan.oop.common.Immutable;

/**
 * @author bvanchuhov
 */
@Immutable
public class Circle implements Shape {

    private final double radius;

    /**
     * @throws IllegalAccessException
     */
    public Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("negative radius: " + radius);
        }

        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
