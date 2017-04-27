package com.bvan.oop.lesson5.shape;

import com.bvan.oop.common.Immutable;

import java.util.Arrays;
import java.util.List;

/**
 * @author bvanchuhov
 */
@Immutable
public class Square extends Polygon {

    private final Rectangle rectangle;

    /**
     * @throws IllegalAccessException
     */
    public Square(double side) {
        if (side < 0) {
            throw new IllegalArgumentException("negative side: " + side);
        }

        this.rectangle = new Rectangle(side, side);
    }

    @Override
    public double getArea() {
        return rectangle.getArea();
    }

    @Override
    protected List<Double> getSides() {
        double side = getSide();
        return Arrays.asList(side, side, side, side);
    }

    public double getSide() {
        return rectangle.getWidth();
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + getSide() +
                '}';
    }
}
