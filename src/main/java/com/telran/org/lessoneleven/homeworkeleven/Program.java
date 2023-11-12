package com.telran.org.lessoneleven.homeworkeleven;

import com.telran.org.lessoneleven.homeworkeleven.cardgame.Solitare;
import com.telran.org.lessoneleven.homeworkeleven.mydeque.MyDequeExample;

public class Program {
    public static void main(String[] args) {
        Solitare solitare = new Solitare();
        solitare.startGame(); // first task example

        MyDequeExample deque = new MyDequeExample();
        deque.startMyDequeExample(); // second task example
    }
}
