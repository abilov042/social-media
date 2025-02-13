package com.example.socialmedia.services.conceretes;

import com.example.socialmedia.entity.User;
import com.example.socialmedia.models.request.UserRequest;
import com.example.socialmedia.models.response.PostResponseForUser;
import com.example.socialmedia.models.response.UserResponse;
import com.example.socialmedia.models.result.DataResult;
import com.example.socialmedia.models.result.SuccessDataResult;
import com.example.socialmedia.repository.UserRepository;
import com.example.socialmedia.services.abtracts.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public DataResult<List<UserResponse>> findAll() {
        List<User> users = userRepository.findAllUsers();

        List<UserResponse> userResponses = users.stream()
                .map(u -> {
                    return UserResponse.builder()
                            .id(u.getId())
                            .username(u.getUsername())
                            .email(u.getEmail())
                            .posts(u.getPosts().stream()
                                    .map(p -> {
                                        return PostResponseForUser.builder()
                                                .id(p.getId())
                                                .content(p.getContent())
                                                .build();

                                    }).toList()).build();
                }).toList();
        return new SuccessDataResult<>("Successfully found", userResponses);
    }

    @Override
    public void save(UserRequest userRequest) {

        User user = User.builder()
                .email(userRequest.getEmail())
                .username(userRequest.getUsername())
                .password(userRequest.getPassword()).build();

        this.userRepository.save(user);

    }
}
