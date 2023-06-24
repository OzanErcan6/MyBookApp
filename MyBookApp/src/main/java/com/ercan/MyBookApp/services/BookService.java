package com.ercan.MyBookApp.services;

import com.ercan.MyBookApp.entity.Book;
import com.ercan.MyBookApp.jpaRepository.BookJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookJpaRepository bookJpaRepository;

    public List<Book> getAllBooks(){
        return bookJpaRepository.findAll();
    }
}
