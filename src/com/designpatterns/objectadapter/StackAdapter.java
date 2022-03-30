package com.designpatterns.objectadapter;

import java.util.Vector;

public class StackAdapter<T> implements Stack<T> {
    StackAdapter() {
        _adaptee = new Vector<T>();
    }

    @Override
    public void push(T t) {
        _adaptee.insertElementAt(t, size());
    }

    @Override
    public T pop() {
        T t = _adaptee.elementAt(size() - 1);
        _adaptee.removeElementAt(size() - 1);
        return t;
    }

    @Override
    public int size() {
        return _adaptee.size();
    }

    private final Vector<T> _adaptee;
}
