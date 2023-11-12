package com.telran.org.lessoneleven.homeworkeleven.mydeque;

import java.util.ArrayDeque;

public class MyDequeExample {
    public void startMyDequeExample() {
        // Create the instances of both classes
        MyArrayDeque myDeque = new MyArrayDeque();
        ArrayDeque<Integer> javaDeque = new ArrayDeque<>();

        // a)
        for (int i = 1; i <= 10; i++) {
            myDeque.addToHead(i);
            javaDeque.addFirst(i);
        }

        // b)
        for (int i = 11; i <= 22; i++) {
            myDeque.addToTail(i);
            javaDeque.addLast(i);
        }

        // Show result after adding elements
        System.out.println("Result after adding: ");
        System.out.println("MyArrayDeque: " + myDeque);
        System.out.println("ArrayDeque:    " + javaDeque);
        System.out.println();

        // c)
        for (int i = 0; i < 4; i++) {
            myDeque.removeTail();
            javaDeque.removeLast();
        }

        // d)
        for (int i = 0; i < 2; i++) {
            myDeque.removeHead();
            javaDeque.removeFirst();
        }

        // Print result
        System.out.println("Result after deleting: ");
        System.out.println("MyArrayDeque: " + myDeque);
        System.out.println("ArrayDeque:    " + javaDeque);
    }
}
