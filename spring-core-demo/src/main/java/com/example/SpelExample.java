package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpelExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spel-config.xml");
        Product product = context.getBean("product", Product.class);
        product.displayProduct();
    }
}
