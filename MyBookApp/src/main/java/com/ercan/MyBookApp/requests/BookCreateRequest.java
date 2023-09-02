package com.ercan.MyBookApp.requests;

import java.util.ArrayList;
import java.util.List;

public class BookCreateRequest {

    private Long id;
    private String title;
    private List<Long> writer_ids = new ArrayList<>();
    private Long isbn;
    private Long publisher_id;


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

    public List<Long> getWriter_ids() {
        return writer_ids;
    }

    public void setWriter_ids(List<Long> writer_ids) {
        this.writer_ids = writer_ids;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public Long getPublisher_id() {
        return publisher_id;
    }

    public void setPublisher_id(Long publisher_id) {
        this.publisher_id = publisher_id;
    }
}
