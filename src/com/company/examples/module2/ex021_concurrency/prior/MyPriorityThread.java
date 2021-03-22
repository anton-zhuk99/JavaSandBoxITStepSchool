package com.company.examples.module2.ex021_concurrency.prior;

public class MyPriorityThread extends Thread {

    private static boolean flag = true;

    public MyPriorityThread(String name, int priority) {
        super(name);
        super.setPriority(priority); // 1 .. 10 // 5
        super.start();
    }

    private void mySleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " thread interrupted.");
        }
    }

    @Override
    public void run() {
        System.out.println(super.getName() + " launched");

        int counter = 0;
        do {
            mySleep(1);
            counter++;
        } while (flag && counter < 4_000);
        flag = false;

        System.out.println("Counter in thread " + super.getName() + " = " + counter);

        System.out.println(super.getName() + " finished");
    }

    private void countAndPrintMark(String str) {

    }
}
