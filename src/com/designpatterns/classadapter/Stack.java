package com.designpatterns.classadapter;

// target
public interface Stack<T> {
    void push(T t);
    T pop();
    // inherit size() method from Vector
}
