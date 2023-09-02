package com.ercan.MyBookApp.controllers;

import com.ercan.MyBookApp.entity.Publisher;
import com.ercan.MyBookApp.services.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/publishers")
@CrossOrigin
public class PublisherController {

    @Autowired
    PublisherService publisherService;

    @GetMapping("/getAllPublishers")
    public List<Publisher> getAllPublishers(){
        return publisherService.getAllPublishers();
    }




}
