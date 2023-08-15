package com.example.demo.Book;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "book")
public class BookController {


    List<Book> books=new ArrayList<>();

    @GetMapping()
public String test(){
    return "Book Route is Working";
}

@GetMapping("/all")
public List<Book> getBooks(){
        return books;
}
@PostMapping("/add")
public Book addBook(@RequestBody Book bookdata){
        books.add(bookdata);
        return bookdata;

}
}
