package com.concurrency;

public class Adder implements Runnable{
    Adder(Counter counter, int value) {
        this.value = value;
        this.counter = counter;
    }
    public void run() {
        counter.add(value);
    }
    private Counter counter;
    private int value;
}
