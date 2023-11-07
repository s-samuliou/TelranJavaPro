package com.telran.org.lessonten.homeworkten.sorting;

import com.telran.org.lessonten.homeworkten.bookdata.Book;

import java.util.Comparator;

public class SortBookByPublisher implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPublisher().getName().compareTo(o2.getPublisher().getName());
    }
}
