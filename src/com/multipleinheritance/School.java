package com.multipleinheritance;

public class School implements Teacher,Student{
    public void principal() {
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);
    }

    @Override
    public void listening() {
        System.out.println("this is Student interface");
    }

    @Override
    public void teaching() {
        System.out.println("this is Teacher interface");
    }
}
