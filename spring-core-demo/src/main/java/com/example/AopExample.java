package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AopExample {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("aop-config.xml");
        Order order = context.getBean("order", Order.class);
        order.processOrder();
    }
}
