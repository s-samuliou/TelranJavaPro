package com.telran.org.lessonten.homeworkten.sorting;

import com.telran.org.lessonten.homeworkten.bookdata.Book;

import java.util.Comparator;

public class SortBookByAuthor implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getAuthor().getSurname().compareTo(o2.getAuthor().getSurname());
    }
}
