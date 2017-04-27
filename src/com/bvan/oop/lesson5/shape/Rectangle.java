package com.bvan.oop.lesson5.shape;

import com.bvan.oop.common.Immutable;

import java.util.Arrays;
import java.util.List;

/**
 * @author bvanchuhov
 */
@Immutable
public class Rectangle extends Polygon {

    private final double width;
    private final double height;

    /**
     * @throws IllegalAccessException
     */
    public Rectangle(double width, double height) {
        if (width < 0) {
            throw new IllegalArgumentException("negative width: " + width);
        }
        if (height < 0) {
            throw new IllegalArgumentException("negative height: " + height);
        }

        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this(0, 0);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    protected List<Double> getSides() {
        return Arrays.asList(width, width, height, height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
