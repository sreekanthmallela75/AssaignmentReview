package com.singleinheritance;

public class Cow extends Tiger {
    public void animal1(){
        System.out.println("This is domestic animal");
    }

    public static void main(String[] args) {
        Cow c = new Cow();
        c.animal();
        c.animal1();
    }
}
