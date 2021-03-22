package com.company.examples.module2.ex021_concurrency.impl;

public class MyThreadSimple implements Runnable {

    private String name;

    public MyThreadSimple(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Thread " + this.name + " launched.");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread " + this.name + " interrupted.");
        }

        System.out.println("Thread " + this.name + " finished.");
    }
}
