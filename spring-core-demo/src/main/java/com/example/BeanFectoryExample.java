package com.example;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFectoryExample {
    public static void main(String[] args){
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        Person person = factory.getBean("person", Person.class);
        person.displayInfo();
    }
}
