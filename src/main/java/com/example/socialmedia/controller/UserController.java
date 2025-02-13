package com.example.socialmedia.controller;

import com.example.socialmedia.models.request.UserRequest;
import com.example.socialmedia.models.response.UserResponse;
import com.example.socialmedia.models.result.DataResult;
import com.example.socialmedia.models.result.Result;
import com.example.socialmedia.models.result.SuccessResult;
import com.example.socialmedia.services.abtracts.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;


    @PostMapping
    public Result save(@RequestBody UserRequest userRequest) {
        userService.save(userRequest);

        return new SuccessResult("User Saved");
    }

    @GetMapping
    public DataResult<List<UserResponse>> getAll() {
        return this.userService.findAll();
    }


}
