package com.bvan.oop.lesson3.record;

import com.bvan.oop.common.Immutable;

import java.util.Date;

/**
 * @author bvanchuhov
 */
@Immutable
public class Record {

    private final String name;
    private final Date date; // mutable object

    public Record(String name) {
        this.name = name;
        this.date = new Date();
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return new Date(date.getTime()); // mutable object copy
    }

    @Override
    public String toString() {
        return "Record{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
