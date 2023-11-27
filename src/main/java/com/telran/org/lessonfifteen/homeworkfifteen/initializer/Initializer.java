package com.telran.org.lessonfifteen.homeworkfifteen.initializer;

import com.telran.org.lessonfifteen.homeworkfifteen.bookdata.Author;
import com.telran.org.lessonfifteen.homeworkfifteen.bookdata.Book;
import com.telran.org.lessonfifteen.homeworkfifteen.bookdata.Publisher;

import java.util.ArrayList;
import java.util.List;

public class Initializer {
    public List<Book> initializeBooks() {
        Author ronaldo = new Author("Cristiano", "Ronaldo", 1985);
        Author messi = new Author("Leonel", "Messi", 1987);
        Author neymar = new Author("Neymar", "Da Silva", 1992);

        Publisher madrid = new Publisher("Madrid", 2012);
        Publisher moscow = new Publisher("Moscow", 2010);

        List<Book> books = new ArrayList<>();
        books.add(new Book("Книга1", ronaldo, 200, 2005, madrid));
        books.add(new Book("Книга2", messi, 150, 2010, moscow));
        books.add(new Book("Книга3", neymar, 300, 2015, madrid));
        books.add(new Book("Книга4", ronaldo, 250, 2008, moscow));
        books.add(new Book("Книга5", messi, 180, 2012, madrid));
        books.add(new Book("Книга6", neymar, 220, 2017, moscow));
        books.add(new Book("Книга7", ronaldo, 170, 2006, madrid));

        return books;
    }
}
