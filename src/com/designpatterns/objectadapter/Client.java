package com.designpatterns.objectadapter;

public class Client {
    public static void main(String[] args) {
        Stack<String> s = new StackAdapter<String>();
        s.push("foo");
        s.push("bar");
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
