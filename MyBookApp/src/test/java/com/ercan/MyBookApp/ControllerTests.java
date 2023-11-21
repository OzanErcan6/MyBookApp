package com.ercan.MyBookApp;

import com.ercan.MyBookApp.controllers.BookController;
import com.ercan.MyBookApp.entity.Book;
import com.ercan.MyBookApp.entity.Publisher;
import com.ercan.MyBookApp.entity.Writer;
import com.ercan.MyBookApp.services.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ControllerTests {
    @InjectMocks
    private BookController bookController;

    @Mock
    private BookService bookService;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetBookById() {
        // Arrange
        Long bookId = 1L;

        Writer writer1 = new Writer(1L, "Author1", new ArrayList<>());
        Writer writer2 = new Writer(2L, "Author2", new ArrayList<>());
        List<Writer> writers = Arrays.asList(writer1, writer2);

        Long isbn = 1234567890L;

        Publisher publisher = new Publisher(1L, "PublisherName", new ArrayList<>());
        publisher.addBook(new Book(bookId, "Sample Book", writers, isbn, publisher, new Date()));

        Book expectedBook = publisher.getBooks().get(0);

        when(bookService.getBookById(bookId)).thenReturn(expectedBook);

        ResponseEntity<Book> response = bookController.getBookById(bookId);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(expectedBook, response.getBody());
    }
}
