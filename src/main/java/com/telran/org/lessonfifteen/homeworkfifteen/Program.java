package com.telran.org.lessonfifteen.homeworkfifteen;

import com.telran.org.lessonfifteen.homeworkfifteen.bookdata.Book;
import com.telran.org.lessonfifteen.homeworkfifteen.initializer.Initializer;

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
        String[][] names = {{"abc", "last"}, {"pklz", "yelp"}, {"rpng", "note"}, {"pklz", "xyz"}};

        //Arrays.sort(names, new SortByNameAndSurname());


        for (String[] name : names) {
            System.out.println("{" + name[0] + ", " + name[1] + "}");
        }
    }
}
