package com.qa;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> content;

    Library() {
        content = new ArrayList<>();
    }

    void addBook(Book book) {
        content.add(book);
    }

    void removeBook(Book book) {
        content.remove(book);
    }

    @Override
    public String toString() {
        return "Library{" +
                "content=" + content +
                '}';
    }
}
