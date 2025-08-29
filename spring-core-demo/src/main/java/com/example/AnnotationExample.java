package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationExample {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation-config.xml");

        LibraryService service = context.getBean(LibraryService.class);
        service.addBook("Java");
    }
}
