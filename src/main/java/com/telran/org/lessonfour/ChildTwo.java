package com.telran.org.lessonfour;

public class ChildTwo extends Parent{
    @Override
    public void printGreetings() {
        System.out.println("Hello I am ChildTwo");
    }

    public void printAll() {
        printGreetings();
        printThanks();
        printWishes();
    }
}
