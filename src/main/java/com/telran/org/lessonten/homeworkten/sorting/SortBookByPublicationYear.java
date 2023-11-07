package com.telran.org.lessonten.homeworkten.sorting;

import com.telran.org.lessonten.homeworkten.bookdata.Book;

import java.util.Comparator;

public class SortBookByPublicationYear implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPublicationYear() - o2.getPublicationYear();
    }
}
