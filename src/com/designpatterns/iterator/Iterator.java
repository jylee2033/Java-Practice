package com.designpatterns.iterator;

public interface Iterator<T> {
    void first();
    void next();
    boolean isDone();
    T current();
}
