package com.company.examples.module2.ex021_concurrency;

import java.util.Scanner;

public class Processor {

    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.printf("Producer thread running ...%n");
            wait();
            System.out.printf("Producer resumed ...%n");
        }
    }

    public void consume() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Thread.sleep(2000);

        synchronized (this) {
            System.out.printf("Press [ENTER] ...%n");
            scanner.nextLine();
            System.out.printf("[ENTER] pressed.%n");
            notify();
            Thread.sleep(5000);
        }
        scanner.close();
    }

}
