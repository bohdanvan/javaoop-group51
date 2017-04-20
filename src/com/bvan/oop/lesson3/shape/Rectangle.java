package com.bvan.oop.lesson3.shape;

import com.bvan.oop.common.Immutable;

/**
 * @author bvanchuhov
 */
@Immutable
public class Rectangle implements Shape {

    private final double width;
    private final double height;

    /**
     * @throws IllegalAccessException
     */
    public Rectangle(double width, double height) {
        checkWidth(width);
        checkHeight(height);

        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this(0, 0);
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getArea() {
        return width * height;
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

    /**
     * @throws IllegalArgumentException
     */
    private void checkHeight(double aHeight) {
        if (aHeight < 0) {
            throw new IllegalArgumentException("negative height: " + aHeight);
        }
    }

    /**
     * @throws IllegalArgumentException
     */
    private void checkWidth(double aWidth) {
        if (aWidth < 0) {
            throw new IllegalArgumentException("negative width: " + aWidth);
        }
    }
}
