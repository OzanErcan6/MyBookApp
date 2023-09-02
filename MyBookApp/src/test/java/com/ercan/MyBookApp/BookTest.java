package com.ercan.MyBookApp;

import com.ercan.MyBookApp.entity.Book;
import com.ercan.MyBookApp.entity.Writer;
import com.ercan.MyBookApp.jpaRepository.BookRepository;
import com.ercan.MyBookApp.services.BookService;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Fail.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
public class BookTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    BookRepository bookRepository;

    @Autowired
    BookService bookService;

    @Autowired
    EntityManager entityManager;

    @Test
    void findById_basic() {
        Optional<Book> book = bookRepository.findById(30001L);
        if(book.isPresent()){
            System.out.println(book.get().getTitle());
            assertEquals("book_name_1",book.get().getTitle());
        }
        else{
            fail("book not found");
        }
    }

    @Test
    @Transactional
    void retrieveWritersForBook() {
        Book book = entityManager.find(Book.class, 1L);

        for(Writer w: book.getWriters()){
            logger.info("writer: {}", w.getName());
        }
    }

    @Test
    @Transactional
    void findPublisherForBook() {
        Optional<Book> book = bookRepository.findById(Long.valueOf(1));
        if(book.isPresent()){
            System.out.println(book.get().getPublisher().getName());
            assertEquals("zambak",book.get().getPublisher().getName());
        }
        else{
            fail("book not found");
        }
    }

    @Test
    @Transactional
    void findAllBooks() {
        List<Book> books = bookService.getAllBooks();

        for(Book book: books){
            logger.info("book: {}", book.getTitle());
        }
    }


}
