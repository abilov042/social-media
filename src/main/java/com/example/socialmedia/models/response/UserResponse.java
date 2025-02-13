package com.example.socialmedia.models.response;

import com.example.socialmedia.entity.Post;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private Integer id;
    private String username;
    private String email;
    private List<PostResponseForUser> posts;
}
