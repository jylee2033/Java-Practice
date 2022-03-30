package com.designpatterns.iterator;

public class Main {
    public static void main(String[] args){
        Directory root = new Directory("");
        Directory usr = new Directory("usr", root);
        new File("core", root);
        new File("adm", usr);
        new Directory("foo", usr);
        new File("bar1", usr);

        // use iterator to print contents of /usr
        Iterator<Node> it = usr.iterator();
        for (it.first(); !it.isDone(); it.next()) {
            Node n = it.current();
            System.out.println(n.getAbsoluteName());
        }
    }
}
