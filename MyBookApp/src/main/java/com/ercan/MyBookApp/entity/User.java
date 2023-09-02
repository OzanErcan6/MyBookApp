package com.ercan.MyBookApp.entity;


import jakarta.persistence.*;

@Entity
@Table(name="appUser")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String userName;


}
