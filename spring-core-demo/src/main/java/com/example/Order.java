package com.example;

public class Order {

    private String item;

    public void setItem(String item) {
        this.item = item;
    }

    public void processOrder() {
        System.out.println("Processing order for: " + item);
    }
}
