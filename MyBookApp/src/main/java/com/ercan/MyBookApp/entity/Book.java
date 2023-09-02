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

    public Book(Long id, String title, List<Writer> writers, Long isbn, Publisher publisher) {
        this.id = id;
        this.title = title;
        this.writers = writers;
        this.isbn = isbn;
        this.publisher = publisher;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Writer> getWriters() {
        return writers;
    }

    public void addWriter(Writer writer) {
        this.writers.add(writer);
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", writers=" + writers +
                ", isbn=" + isbn +
                ", publisher=" + publisher +
                '}';
    }
}

