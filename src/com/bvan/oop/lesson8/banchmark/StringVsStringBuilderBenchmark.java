package com.bvan.oop.lesson8.banchmark;

/**
 * @author bvanchuhov
 */
public class StringVsStringBuilderBenchmark {

    public static void main(String[] args) {
        int iterations = 1000000;
        System.out.println("String Builder\t: " + stringBuilderTime(iterations));
        System.out.println("String\t\t\t: " + stringTime(iterations));
    }

    private static long stringTime(int iterations) {
        long start = System.currentTimeMillis();

        testString(iterations);

        long finish = System.currentTimeMillis();
        return finish - start;
    }

    private static long stringBuilderTime(int iterations) {
        long start = System.currentTimeMillis();

        testStringBuilder(iterations);

        long finish = System.currentTimeMillis();
        return finish - start;
    }

    private static void testString(int iterations) {
        String s = "";
        for (int i = 0; i < iterations; i++) {
            s += "1";
        }
    }

    private static void testStringBuilder(int iterations) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("1");
        }
    }
}
