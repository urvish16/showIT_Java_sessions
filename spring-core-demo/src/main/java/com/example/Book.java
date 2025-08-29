package com.example;

public class Book {
    private String title;
    private String id;

    public Book() {
        this.id = "Book_" + System.currentTimeMillis();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void displayBook() {
        System.out.println("Book Title: " + title + ", ID: " + id);
    }
}
