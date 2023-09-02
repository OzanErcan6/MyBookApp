package com.ercan.MyBookApp.jpaRepository;

import com.ercan.MyBookApp.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Long> {

}

