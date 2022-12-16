package com.multilevel;

public class Child extends Parent {
    public void children(){
        System.out.println("This is child class");
    }

    public static void main(String[] args) {
        Child ch = new Child();
        ch.grandfather();
        ch.father();
        ch.children();
    }
}
