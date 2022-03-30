package com.designpatterns.bridge;

// ConcreteImplementor
class ArrayBasedStack<T> implements StackImpl<T> {
    public void push(T t){
        if ( !(_size == MAX_SIZE-1)){
            _elements[++_size] = t; }
    }

    public T pop(){
        if ((_size == -1)){ return null; }
        return _elements[_size--];
    }

    private final int MAX_SIZE = 100;
    private T[] _elements = (T[])new Object[MAX_SIZE];
    private int _size = -1;
}