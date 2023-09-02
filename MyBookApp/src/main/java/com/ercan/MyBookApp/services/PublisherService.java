package com.ercan.MyBookApp.services;

import com.ercan.MyBookApp.entity.Book;
import com.ercan.MyBookApp.entity.Publisher;
import com.ercan.MyBookApp.jpaRepository.BookRepository;
import com.ercan.MyBookApp.jpaRepository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {
    @Autowired
    PublisherRepository publisherRepository;

    public List<Publisher> getAllPublishers(){
        return publisherRepository.findAll();
    }
}
