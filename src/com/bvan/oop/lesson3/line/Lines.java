package com.bvan.oop.lesson3.line;

import com.bvan.oop.common.Mutable;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
@Mutable
public class Lines {

    private final ArrayList<Line> lines = new ArrayList<>();

    public void add(Line line) {
        lines.add(line);
    }

    public boolean isEmpty() {
        return lines.isEmpty();
    }

    /**
     * @throws IllegalStateException if no line exists
     */
    public Line longestLine() {
        if (lines.isEmpty()) {
            throw new IllegalStateException("empty lines list, no longest line");
        }

        Line longestLine = lines.get(0);

        for (Line line : lines) {
            if (longestLine.getLength() < line.getLength()) {
                longestLine = line;
            }
        }

        return longestLine;
    }
}
