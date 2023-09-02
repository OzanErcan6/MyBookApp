package com.ercan.MyBookApp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="book")
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String title;

    @ManyToMany(mappedBy = "books", fetch = FetchType.LAZY) // books variable in the Writer entity could have the (mappedBy = "writers") does not matter
    @JsonIgnore  //excludes the field
    private List<Writer> writers = new ArrayList<>();

    @Column(nullable = false)
    private Long isbn;

    @ManyToOne(fetch = FetchType.LAZY) // default is eager fetching
    @JsonIgnore
    private Publisher publisher;

    public Book() {
    }




}

