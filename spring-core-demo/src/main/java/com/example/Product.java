package com.example;

public class Product {
    private String productName;

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void displayProduct() {
        System.out.println("Product: " + productName);
    }
}