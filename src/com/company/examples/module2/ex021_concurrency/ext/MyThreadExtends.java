package com.company.examples.module2.ex021_concurrency.ext;

public class MyThreadExtends extends Thread {

    public MyThreadExtends(String name) {
        super(name); // new Thread(String);
        super.start();
    }

    @Override
    public void run() {
        System.out.println(super.getName() + " - launch");

        try {
            for (int count = 1; count <= 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + super.getName() +
                        " counter: " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(super.getName() + " - interrupted");
        }
        System.out.println(super.getName() + " finished");
    }
}
