package com.telran.org.lessonseven.homeworkseven;

import java.util.Iterator;

public class CustomIterator implements Iterator {
    private int[] integers;
    private int position;

    public CustomIterator(int[] integers) {
        this.integers = integers;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < integers.length;
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            return null;
        }

        return integers[position++];
    }
}
