package com.ercan.MyBookApp.controllers;

import com.ercan.MyBookApp.entity.Writer;
import com.ercan.MyBookApp.services.WriterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/writers")
@CrossOrigin
public class WriterController {

    @Autowired
    WriterService writerService;

    @GetMapping("/getAllWriters")
    public List<Writer> getAllWriters(){
        return writerService.getAllWriters();
    }





}
