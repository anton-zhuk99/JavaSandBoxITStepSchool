package com.company.examples.module2.ex021_concurrency;

public class SumArrayThread extends Thread {

    private int[] arr;
    private static ArraySumator as;
    private int answer;

    public SumArrayThread(String name, int[] arr) {
        super(name);
        this.arr = arr;
        as = new ArraySumator();
        super.start();
    }

    @Override
    public void run() {
        synchronized (as) {
            answer = as.sum(this.arr);
        }

        System.out.println("In thread " + Thread.currentThread().getName() + " answer = " + answer);
    }
}
