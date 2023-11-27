package com.telran.org.lessonfifteen.homeworkfifteen.bookdata;

public class Book {
    private String bookName;
    private Author author;
    private int pageCount;
    private int publicationYear;
    private Publisher publisher;

    public Book(String bookName, Author author, int pageCount, int publicationYear, Publisher publishingHouse) {
        this.bookName = bookName;
        this.author = author;
        this.pageCount = pageCount;
        this.publicationYear = publicationYear;
        this.publisher = publishingHouse;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author=" + author +
                ", numberOfPages=" + pageCount +
                ", yearOfPublishing=" + publicationYear +
                ", publishingHouse=" + publisher +
                '}';
    }
}
