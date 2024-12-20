package com.example.backend.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@IdClass(FavouriteIdClass.class)
@NoArgsConstructor
@AllArgsConstructor
public class Favourite {
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
    @Id
    @ManyToOne
    @JoinColumn(name = "message_id")
    private Message message;
}
