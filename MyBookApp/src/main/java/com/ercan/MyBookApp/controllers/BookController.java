package com.ercan.MyBookApp.controllers;

import com.ercan.MyBookApp.entity.Book;
import com.ercan.MyBookApp.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


    //get all books


    //post book

    //post books

    //put book

    //delete book

    //delete books



}
