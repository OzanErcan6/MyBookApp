package com.ercan.MyBookApp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="book")
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String title;

    @ManyToMany//(mappedBy = "books") // books variable in the Writer entity could have the (mappedBy = "writers") does not matter
    @JsonIgnore  //excludes the field
    @JoinTable(name="WRITER_BOOK",
            joinColumns = @JoinColumn(name="BOOK_ID"),
            inverseJoinColumns = @JoinColumn(name="WRITER_ID"))
    private List<Writer> writers = new ArrayList<>();

    @Column(nullable = false)
    private Long isbn;

    @ManyToOne // default is eager fetching
    @JoinColumn(name="publisher_id", nullable=false)
    @JsonIgnore
    private Publisher publisher;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    public Book() {
    }

    public Book(Long id, String title, List<Writer> writers, Long isbn, Publisher publisher, Date createDate) {
        this.id = id;
        this.title = title;
        this.writers = writers;
        this.isbn = isbn;
        this.publisher = publisher;
        this.createDate = createDate;
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

    public void setWriters(List<Writer> writers) {
        this.writers = writers;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}

