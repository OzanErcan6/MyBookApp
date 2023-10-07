package com.ercan.MyBookApp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Specify the generation strategy
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String text;

    @ManyToOne(fetch = FetchType.LAZY) // Specify the FetchType (lazy in this case)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name="customer_id", nullable=false)
    @JsonIgnore
    private Customer customer;


    public Post() {
    }

    public Post(String title, String text, Customer customer) {
        this.title = title;
        this.text = text;
        this.customer = customer;
    }

    public Post(Long id, String title, String text, Customer customer) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.customer = customer;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
