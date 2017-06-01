package com.bvan.oop.lesson12.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author bvanchuhov
 */
public class BarWithExecutor {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int drinkerId = 0; drinkerId < 5; drinkerId++) {
            Runnable drinker = new Drinker();
            executor.execute(drinker);
        }
        executor.shutdown();

        ThreadUtils.println("Bar is closed");
    }
}
