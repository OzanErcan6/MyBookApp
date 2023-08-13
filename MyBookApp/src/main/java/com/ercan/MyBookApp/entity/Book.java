package com.ercan.MyBookApp.entity;


import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name="book")
@Data
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    //@Column(name="fullname", nullable = false)
    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String writer;

    @Column(nullable = false)
    private Long isbn;

    public Book() {
    }
}

