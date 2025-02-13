package com.example.socialmedia.repository;

import com.example.socialmedia.entity.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {


    @EntityGraph(value = "graph.User", type = EntityGraph.EntityGraphType.FETCH)
    @Query("SELECT u FROM User u")
    List<User> findAllUsers();

    @EntityGraph(attributePaths = {"posts"})
    List<User> findByUsername(String username);
}
