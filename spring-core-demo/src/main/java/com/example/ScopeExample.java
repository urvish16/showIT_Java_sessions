package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeExample {
    public static void main(String[] aegs){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("scope-config.xml");

        //singleton
        Book book1 = applicationContext.getBean("singletonBook", Book.class);
        Book book2 = applicationContext.getBean("singletonBook", Book.class);
        book1.displayBook();
        book2.displayBook();

        //prototype
        Book book3 = applicationContext.getBean("prototypeBook", Book.class);
        Book book4 = applicationContext.getBean("prototypeBook", Book.class);
        book3.displayBook();
        book4.displayBook();
    }
}
