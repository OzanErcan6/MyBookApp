package com.ercan.MyBookApp.controllers;

import com.ercan.MyBookApp.entity.Book;
import com.ercan.MyBookApp.requests.BookCreateRequest;
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

    @PostMapping
    public Book createBook(@RequestBody BookCreateRequest bookCreateRequest){
        return bookService.createBook(bookCreateRequest);
    }
    //put book

    @DeleteMapping("/{bookId}")
    public void deleteBookByBookId(@PathVariable Long bookId){
        bookService.deleteById(bookId);
    }

}
