package com.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

class Directory extends Node {

    private List<Node> _children;

    Directory(String n){ this(n, null); }
    Directory(String n, Directory p) {
        super(n,p);
    }
    public String getAbsoluteName(){ return _name; }
    public void add(Node n){
        _children.add(n);
    }

    public List<String> find(String s){
        List<String> result = new ArrayList<String>();
        if (_name.indexOf(s) != -1){
            result.add(getAbsoluteName());
        }
        for (Node child : _children){
            result.addAll(child.find(s));
        }
        return result;
    }

    public Iterator<Node> iterator() {
        return new DirectoryIterator(this);
    }

    private class DirectoryIterator implements Iterator<Node> {
        private List<Node> _files;
        private int _fileCnt;

        DirectoryIterator(Directory d) {
            _files = d._children;
            _fileCnt = 0;
        }

        public void first() {
            _fileCnt = 0;
        }

        public void next() {
            _fileCnt++;
        }

        public boolean isDone() {
            return _fileCnt == _files.size();
        }

        public Node current() {
            return _files.get(_fileCnt);
        }
    }
}