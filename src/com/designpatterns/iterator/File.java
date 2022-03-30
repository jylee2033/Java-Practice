package com.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

class File extends Node {
    File(String n, Directory p){
        super(n,p);
    }

    public List<String> find(String s){
        List<String> result = new ArrayList<String>();
        if (_name.indexOf(s) != -1){
            result.add(this.getAbsoluteName());
        }
        return result;
    }
}