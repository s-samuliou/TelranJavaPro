package com.telran.org.lessoneleven.homeworkeleven.mydeque;

public interface MyDeque {
    void addToHead(Integer element);
    void addToTail(Integer element);
    boolean isEmpty();
    Integer removeHead();
    Integer removeTail();
    Integer peekHead();
    Integer peekTail();
}
