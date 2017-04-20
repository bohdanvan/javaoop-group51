package com.bvan.oop.lesson3.line;

import com.bvan.oop.common.Immutable;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * @author bvanchuhov
 */
@Immutable
public class Line {

    private final Point start;
    private final Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double getLength() {
        return sqrt(pow(start.getX() - end.getX(), 2) + pow(start.getY() - end.getY(), 2));
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }
}
