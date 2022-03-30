package com.designpatterns.objectadapter;

public interface Stack<T> {
    void push(T t);
    T pop();
    int size();
}
