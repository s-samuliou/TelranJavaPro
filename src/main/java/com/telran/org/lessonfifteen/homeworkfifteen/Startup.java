package com.telran.org.lessonfifteen.homeworkfifteen;

import com.telran.org.lessonfifteen.homeworkfifteen.bookdata.Book;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Startup {
    public void start(List<Book> books) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. По автору\n" +
                "2. По году издания\n" +
                "3. По издательству\n" +
                "Выберите вариант сортировки: ");
        int personChoice = scanner.nextInt();

        Comparator<Book> sortBook;

        switch (personChoice) {
            case 1:
                sortBook = Comparator.comparing(o -> o.getAuthor().getSurname());
                books.sort(sortBook);
                break;
            case 2:
                sortBook = Comparator.comparingInt(Book::getPublicationYear);
                books.sort(sortBook);
                break;
            case 3:
                sortBook = Comparator.comparing(o -> o.getPublisher().getName());
                books.sort(sortBook);
                break;
            default:
                System.out.println("Wrong choice!");
                return;
        }

        System.out.println("Содержимое книжной полки после сортировки:");
        for (Book book : books) {
            System.out.println(book.getBookName() + " - "
                    + book.getAuthor().getSurname() + " - "
                    + book.getPublicationYear() + " - "
                    + book.getPublisher().getName());
        }
    }
}
