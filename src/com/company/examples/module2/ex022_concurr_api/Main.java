package com.company.examples.module2.ex022_concurr_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class Main {

    static Callable<String> createCallable(String str, int timeout) {
        return () -> {
            sleep(timeout);
            return str;
        };
    }

    static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            System.out.printf("Exception occurred! Message: %s%n", e.getMessage());
        }
    }

    static void shutdown(ExecutorService executor, int timeout) {
        try {
            executor.shutdown();
            executor.awaitTermination(timeout, TimeUnit.SECONDS);
        } catch (InterruptedException exc) {
            System.out.printf("Exception occurred! Message: %s%n", exc.getMessage());
        } finally {
            if (!executor.isTerminated()) {
                System.out.printf("Cancel all tasks!%n");
                executor.shutdownNow();
            }
        }
    }

    static void executorWithCallableAndFutureExample() throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2); // pool thread

        Runnable task1 = () -> {
            sleep(2000);
            System.out.printf("Hello! I'm in %s%n", Thread.currentThread().getName());
        };
        Callable<Integer> getRnd = () -> {
            Random rnd = new Random(System.currentTimeMillis()); // seed
            sleep(3000);
            return rnd.nextInt(1000);
        };

        Future<Integer> future = executor.submit(getRnd);

        System.out.println("Future ready? " + future.isDone());

        Integer result = future.get();

        System.out.println("Future ready? " + future.isDone());
        System.out.println("Result is " + result);

        shutdown(executor, 3);
    }

    // Java Concurrency API
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newWorkStealingPool(); // thread pool

        List<Callable<String>> callables = Arrays.asList(
                createCallable("task1", 1000),
                createCallable("task2", 0),
                createCallable("task3", 1000)
        );

        //List<Future<String>> futures = executor.invokeAll(callables);
        String result = executor.invokeAny(callables);
        System.out.println(result);

//        List<String> results = new ArrayList<>();
//        for (Future<String> future: futures) {
//            results.add(future.get());
//            System.out.println(results.get(results.size() - 1));
//        }
//
//        System.out.println(results);

        shutdown(executor, 5);
    }

}
