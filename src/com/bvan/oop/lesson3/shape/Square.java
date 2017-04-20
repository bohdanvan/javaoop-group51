package com.bvan.oop.lesson3.shape;

import com.bvan.oop.common.Immutable;

/**
 * @author bvanchuhov
 */
@Immutable
public class Square implements Shape {

    private final double side;

    /**
     * @throws IllegalAccessException
     */
    public Square(double side) {
        if (side < 0) {
            throw new IllegalArgumentException("negative side: " + side);
        }

        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    public double getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
