package com.ercan.MyBookApp.controllers;

import com.ercan.MyBookApp.DTOs.PostDTO;
import com.ercan.MyBookApp.entity.Post;
import com.ercan.MyBookApp.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/posts")
@CrossOrigin
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("/{id}")
    public Optional<Post> getPostById(@PathVariable Long id) {
        return postService.getPostById(id);
    }

    @GetMapping("/customer/{customerId}")
    public List<PostDTO> getPostsByCustomerId(@PathVariable Long customerId) {
        return postService.getPostsByCustomerId(customerId);
    }

    // Additional methods for saving, updating, and deleting posts

}
