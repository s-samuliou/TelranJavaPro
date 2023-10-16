package com.telran.org.lessonfour;

public class Parent {
    protected String name;
    public void printGreetings() {
        System.out.println("Hell I am parent");
    }

    public final void printThanks() {
        System.out.println("Thank you");
    }

    protected void printWishes() {
        System.out.println("I wish u ...");
    }
}
