package com.telran.org.lessonten.homeworkten;

import com.telran.org.lessonten.homeworkten.bookdata.Book;
import com.telran.org.lessonten.homeworkten.sorting.SortBookByAuthor;
import com.telran.org.lessonten.homeworkten.sorting.SortBookByPublicationYear;
import com.telran.org.lessonten.homeworkten.sorting.SortBookByPublisher;

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

        switch (personChoice) {
            case 1:
                books.sort(new SortBookByAuthor());
                break;
            case 2:
                books.sort(new SortBookByPublicationYear());
                break;
            case 3:
                books.sort(new SortBookByPublisher());
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
