package com.assaignReview;

public class Dog extends Lion{
    public void barking() {
        System.out.println("this is hierachical inheritance");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.barking();
        d.parrot();
        d.Roaring();
    }
}
