package com.company.examples.module2.ex021_concurrency;

public class ArraySumator {

    private int sum;

    // thread-safe
    public int sum(int[] arr) {
        sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.println("Thread:" + Thread.currentThread().getName() + ", sum = " + sum + ", arr[" + i + "] = " + arr[i]);
            Main.sleep(10);
        }
        return sum;
    }
}
