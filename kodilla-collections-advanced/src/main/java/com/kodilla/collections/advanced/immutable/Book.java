package com.kodilla.collections.advanced.immutable;

public class Book {
    protected String author;
    protected String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }


}
