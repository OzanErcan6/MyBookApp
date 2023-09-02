package com.ercan.MyBookApp.controllers;

import com.ercan.MyBookApp.entity.Book;
import com.ercan.MyBookApp.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@CrossOrigin
public class BookController {

    @Autowired
    BookService bookService;

    //get book by id
    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

//    @GetMapping("/findByWriter/{writer}")
//    public List<Book> findByWriter(@PathVariable String writer){
//        return bookService.findByWriter(writer);
//    }

    //get all books


    //post book
    // use BookDTO, need writer id list
//    @PostMapping
//    public Book createBook(@RequestBody Book book){
//        return bookService.createBook(book);
//    }

    //post books

    //put book

    //delete book
//    @DeleteMapping("/{bookId}")
//    public void deleteBookByBookId(@PathVariable Long bookId){
//        bookService.deleteById(bookId);
//    }

    //delete books



}
