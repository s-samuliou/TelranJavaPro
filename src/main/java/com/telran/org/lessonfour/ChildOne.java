package com.telran.org.lessonfour;

public class ChildOne extends MiddleChild{

    public static String HELLO = "Hello";

    private ChildOne() {

    }

    @Override
    public void printGreetings() {
        System.out.println("Hello I am child one");
    }

    public static ChildOne create() {
        return  new ChildOne();
    }
}
