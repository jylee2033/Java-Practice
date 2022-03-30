package com.designpatterns.bridge;

// Abstraction
public class Stack<T> {
    Stack(StackType implType) {
        switch (implType) {
            case LinkedList:
                _impl = new LinkedListBasedStack<T>();
            case Array:
            default:
                _impl = new ArrayBasedStack<T>();
        }
    }

    public void push(T t) {
        _impl.push(t);
    }

    public T pop() {
        return _impl.pop();
    }

    private StackImpl<T> _impl;
}
