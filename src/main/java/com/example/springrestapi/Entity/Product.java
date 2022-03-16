package com.example.springrestapi.Entity;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false,unique = true)
    private String name;
    private int year;
    private Double price;
    private String url;
//    @Transient
//    private int age;
//
//    public int getAge() {
//        return Calendar.getInstance().get(Calendar.YEAR)-this.year;
//    }

    public Product() {
    }

    public Product(String name, int year, Double price, String url) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
