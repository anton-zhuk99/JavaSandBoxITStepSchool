package com.company.examples.module2.ex021_concurrency;

import com.company.examples.module2.ex021_concurrency.ext.MyThreadExtends;
import com.company.examples.module2.ex021_concurrency.impl.MyThreadImpl;
import com.company.examples.module2.ex021_concurrency.impl.MyThreadSimple;
import com.company.examples.module2.ex021_concurrency.prior.MyPriorityThread;

public class Main {

    static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " thread interrupted.");
        }
    }

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

        MyThreadExtends myThread1 = new MyThreadExtends("Child #1");
        MyThreadExtends myThread2 = new MyThreadExtends("Child #2");

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
        System.out.println("Main thread started");

        MyThreadExtends mt1 = new MyThreadExtends("Child #1");
        MyThreadExtends mt2 = new MyThreadExtends("Child #2");
        MyThreadExtends mt3 = new MyThreadExtends("Child #3");

        do {
            sleep(1000);
            System.out.println("Waiting for other threads to finish.");
        } while (mt1.isAlive() || mt2.isAlive() || mt3.isAlive());

        System.out.println("Main thread finished");
    }

    static void joinExample() {
        System.out.println("Main thread started");

        MyThreadExtends mt1 = new MyThreadExtends("Child #1");
        MyThreadExtends mt2 = new MyThreadExtends("Child #2");
        MyThreadExtends mt3 = new MyThreadExtends("Child #3");

        try {
            mt1.join();
            System.out.println("Thread " + mt1.getName() + " joined.");
            mt2.join();
            System.out.println("Thread " + mt2.getName() + " joined.");
            mt3.join();
            System.out.println("Thread " + mt3.getName() + " joined.");
        } catch (InterruptedException exc) {
            System.out.println("Thread main interrupted");
        }

        System.out.println("Main thread finished");
    }

    static void priorityExample() {
        System.out.println("Main thread launched");

        MyPriorityThread mpt1 = new MyPriorityThread("Priority 1", 1);
        MyPriorityThread mpt2 = new MyPriorityThread("Priority 2", 2);
        MyPriorityThread mpt3 = new MyPriorityThread("Priority 3", 3);
        MyPriorityThread mpt4 = new MyPriorityThread("Priority 4", 4);
        MyPriorityThread mpt5 = new MyPriorityThread("Priority 5", 5);
        MyPriorityThread mpt6 = new MyPriorityThread("Priority 6", 6);
        MyPriorityThread mpt7 = new MyPriorityThread("Priority 7", 7);
        MyPriorityThread mpt8 = new MyPriorityThread("Priority 8", 8);
        MyPriorityThread mpt9 = new MyPriorityThread("Priority 9", 9);
        MyPriorityThread mpt10 = new MyPriorityThread("Priority 10", 10);

        do {
            sleep(1000);
        } while (
                mpt1.isAlive() ||
                mpt2.isAlive() ||
                mpt3.isAlive() ||
                mpt4.isAlive() ||
                mpt5.isAlive() ||
                mpt6.isAlive() ||
                mpt7.isAlive() ||
                mpt8.isAlive() ||
                mpt9.isAlive() ||
                mpt10.isAlive()
        );

        System.out.println("Main thread finished");
    }

    public static void main(String[] args) {
        priorityExample();
    }

}
