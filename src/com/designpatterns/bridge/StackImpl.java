package com.designpatterns.bridge;

// Implementor
public interface StackImpl<T> {
    void push(T t);
    T pop();
}
