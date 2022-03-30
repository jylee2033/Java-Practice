package com.designpatterns.bridge;

public class Client {
    public static void main(String[] args) {
        Stack<String> s = new Stack<String>(StackType.Array);
        s.push("foo");
        s.push("bar");
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
