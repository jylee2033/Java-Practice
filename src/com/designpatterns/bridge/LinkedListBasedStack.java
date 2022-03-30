package com.designpatterns.bridge;

// ConcreteImplementor
class LinkedListBasedStack<T> implements StackImpl<T> {
    private class Node {
        public Node next;
        public Node prev;
        public T value;

        public Node(T t) {
        }
    }

    public void push(T t){
        if (_tail == null){
            _tail = new Node(t);
        } else {
            _tail.next = new Node(t);
            _tail.next.prev = _tail;
            _tail = _tail.next;
        }
    }

    public T pop(){
        if (_tail == null) return null;
        T ret = _tail.value;
        _tail = _tail.prev;
        return ret;
    }

    private Node _tail;
}