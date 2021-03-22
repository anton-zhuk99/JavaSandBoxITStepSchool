package com.company.examples.module2.ex021_concurrency.prior;

public class MyPriorityThread extends Thread {

    public MyPriorityThread(String name, int priority) {
        super(name);
        super.setPriority(priority);
        super.start();
    }

    @Override
    public void run() {
        System.out.println(super.getName() + " - launch");
        int counter = 0;
        do {
            counter++;
        } while (counter < 10000);

        System.out.println("Counter = " + counter);
        System.out.println(super.getName() + " finished");
    }
}
