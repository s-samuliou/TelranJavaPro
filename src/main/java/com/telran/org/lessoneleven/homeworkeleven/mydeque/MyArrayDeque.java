package com.telran.org.lessoneleven.homeworkeleven.mydeque;

import java.util.Arrays;

public class MyArrayDeque implements MyDeque {
    private static final int DEFAULT_CAPACITY = 10;
    private static final double GROW_FACTOR = 1.5;

    private Integer[] elements;
    private int headIndex;
    private int tailIndex;
    private int countOfElements;

    public MyArrayDeque() {
        elements = new Integer[DEFAULT_CAPACITY];
    }

    @Override
    public void addToHead(Integer element) {
        if (countOfElements == elements.length) {
            grow();
        }

        headIndex = (headIndex - 1 + elements.length) % elements.length;
        elements[headIndex] = element;
        countOfElements++;
    }

    @Override
    public void addToTail(Integer element) {
        if (countOfElements == elements.length) {
            grow();
        }

        elements[tailIndex] = element;
        tailIndex = (tailIndex + 1) % elements.length;
        countOfElements++;
    }

    @Override
    public boolean isEmpty() {
        return countOfElements == 0;
    }

    @Override
    public Integer removeHead() {
        if (isEmpty()) {
            return null;
        }

        Integer removedElement = elements[headIndex];
        headIndex = (headIndex + 1) % elements.length;
        countOfElements--;
        return removedElement;
    }

    @Override
    public Integer removeTail() {
        if (isEmpty()) {
            return null;
        }

        tailIndex = (tailIndex - 1 + elements.length) % elements.length;
        Integer removedElement = elements[tailIndex];
        countOfElements--;
        return removedElement;
    }

    @Override
    public Integer peekHead() {
        if (isEmpty()) {
            return null;
        }

        return elements[headIndex];
    }

    @Override
    public Integer peekTail() {
        if (isEmpty()) {
            return null;
        }

        return elements[(tailIndex - 1 + elements.length) % elements.length];
    }

    private void grow() {
        int newCapacity = (int) (elements.length * GROW_FACTOR);
        Integer[] newElements = new Integer[newCapacity];
        for (int i = 0; i < countOfElements; i++) {
            newElements[i] = elements[(headIndex + i) % elements.length];
        }
        elements = newElements;
        headIndex = 0;
        tailIndex = countOfElements;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < countOfElements; i++) {
            result.append(elements[(headIndex + i) % elements.length]);
            if (i < countOfElements - 1) {
                result.append(", ");
            }
        }

        result.append("]");
        return result.toString();
    }
}
