package com.example.demo.Book;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

@GetMapping("/info/{id}")
public Book getBookInfo(@PathVariable Long id){

       for (Book book:books){
           if (Objects.equals(book.id,id)){
               return book;
           }
       }
       return new Book();
}

@PostMapping("/add")
public Book addBook(@RequestBody Book bookdata){
        Book newBook=new Book(bookdata.name,bookdata.author,bookdata.quantity,bookdata.releasedYear);
        books.add(newBook);
        return newBook;

}

@PutMapping("/update/{id}")
public Book updateBook(@PathVariable Long id,@RequestBody Book bookData){
for (int i=0;i<books.size();i++){
    if (Objects.equals(books.get(i).id,id)){
        Book updatedBook=bookData;
        updatedBook.id=id;
        books.set(i,updatedBook);
    }
}
return bookData;
}
}
