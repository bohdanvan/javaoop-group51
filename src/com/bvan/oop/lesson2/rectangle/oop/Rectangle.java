package com.bvan.oop.lesson2.rectangle.oop;

import com.bvan.oop.common.Immutable;

/**
 * @author bvanchuhov
 */
@Immutable
public class Rectangle {

    private final double width;
    private final double height;

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

    public Rectangle changeWidth(double width) {
        return new Rectangle(width, this.height);
    }

    public Rectangle changeHeight(double height) {
        return new Rectangle(this.width, height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    private void checkHeight(double aHeight) {
        if (aHeight < 0) {
            throw new IllegalArgumentException("negative height: " + aHeight);
        }
    }

    private void checkWidth(double aWidth) {
        if (aWidth < 0) {
            throw new IllegalArgumentException("negative width: " + aWidth);
        }
    }
}
