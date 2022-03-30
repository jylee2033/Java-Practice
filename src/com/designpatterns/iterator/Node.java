package com.designpatterns.iterator;

import java.util.List;

abstract class Node {
    Node(String name, Directory parent) {
        _name = name;
        _parent = parent;
    }
    public String getAbsoluteName() { return _name; }
    public String toString() {
        return getAbsoluteName();
    }
    public abstract List<String> find(String s);
    protected String _name;
    protected Directory _parent;
}