package com.telran.org.lessoneleven;

public interface MyDeque {

    void addToHead(Integer element);
    void addToTail(Integer element);
    boolean isEmpty();
    Integer removeHead();
    Integer removeTail();
    Integer peakHead();
    Integer peekTail();

}
