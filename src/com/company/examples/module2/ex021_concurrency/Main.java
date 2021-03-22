package com.company.examples.module2.ex021_concurrency;

import com.company.examples.module2.ex021_concurrency.ext.MyThreadExtends;
import com.company.examples.module2.ex021_concurrency.impl.MyThreadImpl;
import com.company.examples.module2.ex021_concurrency.impl.MyThreadSimple;
import com.company.examples.module2.ex021_concurrency.prior.MyPriorityThread;

public class Main {

    static void runnableExample() {
        System.out.println("Main thread launched");

        MyThreadImpl myThread1 = new MyThreadImpl("Child #1"); // thread.start()
        MyThreadImpl myThread2 = new MyThreadImpl("Child #2"); // thread.start()

        for (int i = 1; i <= 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }
        System.out.println("Main thread finished");
    }

    static void extendsExample() {
        System.out.println("Main thread launched");

        MyThreadExtends myThread = new MyThreadExtends("Child #1");

        for (int i = 1; i <= 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }
        System.out.println("Main thread finished");
    }

    static void isAliveExample() {

    }

    static void joinExample() {

    }

    static void priorityExample() {
        System.out.println("Main thread launched");

        MyPriorityThread mpt1 = new MyPriorityThread("Low Priority", Thread.NORM_PRIORITY - 2);
        MyPriorityThread mpt2 = new MyPriorityThread("High Priority", Thread.NORM_PRIORITY + 2);

        try {
            mpt1.join();
            mpt2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread finished");
    }

    public static void main(String[] args) {
        runnableExample();
    }

}
