package com.concurrency;

public class Counter {
    public void add(long value) {
        synchronized (lock) {
            long temp = count + value;
            count = temp;
        }
    }
    public void report() {
        System.out.println("count = " + count);
    }
    private long count = 0;
    Object lock = new Object();
}
