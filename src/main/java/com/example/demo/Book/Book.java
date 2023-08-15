package com.example.demo.Book;

import java.util.Random;

public class Book {

    Random random=new Random();
    public long id;
    public String name;
    public String author;
    public Integer quantity;
    public Integer releasedYear;

    public Book() {
    }

    public Book(String name,String author,Integer quantity,Integer releasedYear) {
        //Random id
        this.id=random.nextLong(1243423523,Integer.MAX_VALUE);
        this.name = name;
        this.author=author;
        this.quantity=quantity;
        this.releasedYear=releasedYear;
    }
}
