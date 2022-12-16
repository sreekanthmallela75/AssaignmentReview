package com.enumeration;

public class EnumExample {
    public static void main(String[] args) {
        for (Season s:Season.values()) {
            System.out.println(s);

            System.out.println(Season.valueOf("SPRING").ordinal());
            System.out.println(Season.valueOf("SUMMER").ordinal());

        }
    }
}
