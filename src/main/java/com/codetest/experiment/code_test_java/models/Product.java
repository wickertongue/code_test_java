package com.codetest.experiment.code_test_java.models;

public class Product {

    // properties
    private String name;
    private int price;

    // constructor
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
