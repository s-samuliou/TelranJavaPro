package com.telran.org.lessonten.homeworkten;

import com.telran.org.lessonten.homeworkten.bookdata.Book;
import com.telran.org.lessonten.homeworkten.initializer.Initializer;
import com.telran.org.lessonten.homeworkten.sorting.SortByNameAndSurname;

import java.util.Arrays;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        taskBookshelf();
        taskSortArrayNames();
    }

    public static void taskBookshelf() {
        List<Book> bookshelf = new Initializer().initializeBooks();

        Startup startup = new Startup();
        startup.start(bookshelf);
    }

    public static void taskSortArrayNames() {
        String[][] names = {{"abc", "last"}, {"pklz", "yelp"}, {"rpng", "note"}, {"ppza", "xyz"}};

        Arrays.sort(names, new SortByNameAndSurname());

        for (String[] name : names) {
            System.out.println("{" + name[0] + ", " + name[1] + "}");
        }
    }
}
