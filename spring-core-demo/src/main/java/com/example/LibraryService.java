package com.example;

import org.springframework.stereotype.Component;

@Component
public class LibraryService {

    public void addBook(String bookName) {
        System.out.println("Added book: " + bookName);
    }
}
