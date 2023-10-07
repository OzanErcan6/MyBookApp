package com.ercan.MyBookApp.services;

import com.ercan.MyBookApp.DTOs.PostDTO;
import com.ercan.MyBookApp.entity.Post;
import com.ercan.MyBookApp.jpaRepository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Optional<Post> getPostById(Long id) {
        return postRepository.findById(id);
    }


    public List<PostDTO> getPostsByCustomerId(Long customerId) {
        List<Post> posts = postRepository.findByCustomerId(customerId);
        return posts.stream()
                .map(post -> {
                    PostDTO dto = new PostDTO();
                    dto.setId(post.getId());
                    dto.setTitle(post.getTitle());
                    dto.setText(post.getText());
                    dto.setCustomerId(post.getCustomer().getId());
                    dto.setImageUrl(post.getImageUrl());
                    return dto;
                })
                .collect(Collectors.toList());
    }
}
