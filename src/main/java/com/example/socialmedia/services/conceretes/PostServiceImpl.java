package com.example.socialmedia.services.conceretes;

import com.example.socialmedia.entity.Post;
import com.example.socialmedia.entity.User;
import com.example.socialmedia.models.request.PostRequest;
import com.example.socialmedia.repository.PostRepository;
import com.example.socialmedia.services.abtracts.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Override
    public void create(PostRequest postRequest) {

        User user = new User();

        user.setId(postRequest.getUserId());

        Post post = Post.builder()
                .likes(0)
                .content(postRequest.getContent())
                .user(user)
                .build();

        postRepository.save(post);


    }
}
