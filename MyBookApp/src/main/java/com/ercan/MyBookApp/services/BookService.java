package com.ercan.MyBookApp.services;

import com.ercan.MyBookApp.entity.Book;
import com.ercan.MyBookApp.jpaRepository.BookRepository;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    @Autowired
    EntityManager entityManager;

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

//    public void deleteById(Long bookId) {
//        bookRepository.deleteById(bookId);
//    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

//    public List<Book> findByWriter(String writer) {
//        return bookRepository.findByWriter(writer);
//    }
}
