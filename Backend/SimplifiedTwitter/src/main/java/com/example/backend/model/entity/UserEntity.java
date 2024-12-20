package com.example.backend.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String encodedPassword;

    public UserEntity(String username, String encodedPassword) {
        this.username = username;
        this.encodedPassword = encodedPassword;
    }

    @Override
    public String toString() {
        return "UserEntity [id=" + id + ", username=" + username + ", encodedPassword=" + encodedPassword + "]";
    }

}
