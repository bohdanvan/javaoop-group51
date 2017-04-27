package com.bvan.oop.lesson5.shape;

import com.bvan.oop.common.Immutable;

import java.util.Arrays;
import java.util.List;

/**
 * @author bvanchuhov
 */
@Immutable
public class Rhombus extends Polygon {

    private final double side;
    private final double angle;

    public Rhombus(double side, double angle) {
        if (side < 0) {
            throw new IllegalArgumentException("negative side: " + side);
        }

        this.side = side;
        this.angle = angle;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2) * Math.sin(angle);
    }

    @Override
    protected List<Double> getSides() {
        return Arrays.asList(side, side, side, side);
    }

    public double getSide() {
        return side;
    }

    public double getAngle() {
        return angle;
    }

    @Override
    public String toString() {
        return "Rhombus{" +
                "side=" + side +
                ", angle=" + angle +
                '}';
    }
}
