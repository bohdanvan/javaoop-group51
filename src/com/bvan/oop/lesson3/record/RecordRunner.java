package com.bvan.oop.lesson3.record;

import java.util.Date;

/**
 * @author bvanchuhov
 */
public class RecordRunner {

    public static void main(String[] args) throws InterruptedException {
        Record record = new Record("Java");
        System.out.println(record);

        Date date = record.getDate();
        date.setTime(0L);

        System.out.println(record);
    }
}
