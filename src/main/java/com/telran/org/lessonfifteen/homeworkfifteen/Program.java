package com.telran.org.lessonfifteen.homeworkfifteen;

import com.telran.org.lessonfifteen.homeworkfifteen.bookdata.Book;
import com.telran.org.lessonfifteen.homeworkfifteen.initializer.Initializer;

import java.util.Arrays;
import java.util.Comparator;
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

        Comparator<String[]> comparator = Comparator.comparing((String[] o) -> o[0]).thenComparing(o -> o[1]);

        Arrays.sort(names, comparator);

        for (String[] name : names) {
            System.out.println("{" + name[0] + ", " + name[1] + "}");
        }
    }
}
