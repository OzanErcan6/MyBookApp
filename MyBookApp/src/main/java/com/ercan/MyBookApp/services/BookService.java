package com.ercan.MyBookApp.services;

import com.ercan.MyBookApp.entity.Book;
import com.ercan.MyBookApp.jpaRepository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public void deleteById(Long bookId) {
        bookJpaRepository.deleteById(bookId);
    }

    public Book createBook(Book book) {
        return bookJpaRepository.save(book);
    }

    public List<Book> findByWriter(String writer) {
        return bookJpaRepository.findByWriter(writer);
    }
}
