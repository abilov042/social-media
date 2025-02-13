package com.example.socialmedia.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@NamedEntityGraph(name ="graph.User",
        attributeNodes = {@NamedAttributeNode(value = "posts")})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String email;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;

    @ManyToMany(mappedBy = "users")
    @ToString.Exclude
    private Set<Channel> channels = new HashSet<>();
}
