package com.ercan.MyBookApp.services;

import com.ercan.MyBookApp.entity.Book;
import com.ercan.MyBookApp.entity.Publisher;
import com.ercan.MyBookApp.entity.Writer;
import com.ercan.MyBookApp.jpaRepository.BookRepository;
import com.ercan.MyBookApp.requests.BookCreateRequest;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    @Autowired
    EntityManager entityManager;

    @Autowired
    PublisherService publisherService;

    @Autowired
    WriterService writerService;


    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

//    public void deleteById(Long bookId) {
//        bookRepository.deleteById(bookId);
//    }

    public Book createBook(BookCreateRequest bookCreateRequest) {
        Publisher publisher = publisherService.getPublisherByPublisherId(bookCreateRequest.getPublisher_id());
        List<Writer> writers = new ArrayList<>();

        for(Long writerId : bookCreateRequest.getWriter_ids()){
            Writer writer = writerService.getWriterByWriterId(writerId);
            if(writer!= null){
                writers.add(writer);
            }
        }

        if(publisher != null && writers.size() != 0){
            Book bookToSave = new Book();
            bookToSave.setId(bookCreateRequest.getId());
            bookToSave.setTitle(bookCreateRequest.getTitle());
            bookToSave.setWriters(writers);
            bookToSave.setPublisher(publisher);
            bookToSave.setIsbn(bookCreateRequest.getIsbn());
            bookToSave.setCreateDate(new Date());
            return bookRepository.save(bookToSave);
        }
        return null;
    }

    public void deleteById(Long bookId) {
        Optional<Book> book = bookRepository.findById(bookId);
        if(book.isPresent()){
            bookRepository.deleteById(bookId);
        }
    }

//    public List<Book> findByWriter(String writer) {
//        return bookRepository.findByWriter(writer);
//    }
}
