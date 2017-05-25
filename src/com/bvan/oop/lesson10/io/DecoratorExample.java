package com.bvan.oop.lesson10.io;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author bvanchuhov
 */
public class DecoratorExample {

    public static void main(String[] args) throws IOException {
        // long output, with buffering, bin file

        DataOutputStream out = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("/files/my.out")
                )
        );

        out.writeLong(10L);

        out.close();
    }
}
