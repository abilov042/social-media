package com.example.socialmedia.services.abtracts;

import com.example.socialmedia.models.request.UserRequest;
import com.example.socialmedia.models.response.UserResponse;
import com.example.socialmedia.models.result.DataResult;

import java.util.List;

public interface UserService {
    void save(UserRequest userRequest);
    DataResult<List<UserResponse>> findAll();
}
