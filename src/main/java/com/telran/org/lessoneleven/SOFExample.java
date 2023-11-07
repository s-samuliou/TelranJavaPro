package com.telran.org.lessoneleven;

public class SOFExample {

    //Будет выполняться пока не переполниться память
    //enfinity//
    //.....//
    //print//
    //print//
    //print//
    //main//

    private static int count = 0;

    public static void main(String[] args) {
        print();
    }

    private static void print() {
        System.out.println("Count: " + count++);
        print();
    }
}
