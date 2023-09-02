package com.ercan.MyBookApp.services;

import com.ercan.MyBookApp.entity.Book;
import com.ercan.MyBookApp.entity.Writer;
import com.ercan.MyBookApp.jpaRepository.BookRepository;
import com.ercan.MyBookApp.jpaRepository.WriterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WriterService {
    @Autowired
    WriterRepository writerRepository;

    public List<Writer> getAllWriters(){
        return writerRepository.findAll();
    }
}
