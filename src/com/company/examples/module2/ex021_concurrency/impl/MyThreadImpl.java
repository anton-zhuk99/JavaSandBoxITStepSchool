package com.company.examples.module2.ex021_concurrency.impl;

public class MyThreadImpl implements Runnable {

    private Thread thread;

    public MyThreadImpl(String name) {
        this.thread = new Thread(this);
        thread.setName(name);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " - launch");
        try {
            for (int count = 1; count <= 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thread.getName() +
                        " counter: " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(thread.getName() + " - interrupted");
        }
        System.out.println(thread.getName() + " finished");
    }

    public Thread getThread() {
        return thread;
    }
}
