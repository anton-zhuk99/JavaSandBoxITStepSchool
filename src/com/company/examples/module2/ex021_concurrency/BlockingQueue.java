package com.company.examples.module2.ex021_concurrency;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class BlockingQueue<T> {

    private Queue<T> queue = new LinkedList<T>();
    private int capacity;
    private Random rnd;

    public BlockingQueue(int capacity) {
        this.capacity = capacity;
        rnd = new Random(System.currentTimeMillis());
    }

    public void put(T element) throws InterruptedException {
        synchronized (this) {
            while(queue.size() == capacity) {
                wait();
            }

            Thread.sleep(Math.abs(rnd.nextInt(3000)));
            queue.add(element);
            System.out.printf("Element %d added to the queue%n", element);
            notify(); // notifyAll() for multiple producer/consumer threads
        }
    }

    public T take() throws InterruptedException {
        synchronized (this) {
            while(queue.isEmpty()) {
                wait();
            }

            Thread.sleep(1000);
            T item = queue.remove();
            System.out.printf("Element %d removed from the queue%n", item);
            notify(); // notifyAll() for multiple producer/consumer threads
            return item;
        }
    }
}