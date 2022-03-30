package com.concurrency;

public class Example {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Adder add2 = new Adder(counter, 2);
        Adder add3 = new Adder(counter, 3);
        Thread thread1 = new Thread(add2);
        Thread thread2 = new Thread(add3);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
            counter.report();
        } catch (InterruptedException e) {
            System.err.println("an error occurred");
        }
    }
}
