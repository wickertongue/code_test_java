package com.codetest.experiment.code_test_java.models;


import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    // properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
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
