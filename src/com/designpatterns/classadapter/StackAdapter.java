package com.designpatterns.classadapter;

import java.util.Vector;

public class StackAdapter<T> extends Vector<T> implements Stack<T> {
    StackAdapter() {
        super();
    }

    @Override
    public void push(T t) {
        insertElementAt(t, size());
    }

    @Override
    public T pop() {
        T t = elementAt(size() - 1);
        removeElementAt(size() - 1);
        return t;
    }
}
