package com.example.socialmedia.controller;

import com.example.socialmedia.models.request.PostRequest;
import com.example.socialmedia.services.abtracts.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;


    @PostMapping
    public void create(@RequestBody PostRequest postRequest) {
        postService.create(postRequest);
    }
}
