package com.example.backend.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.model.entity.Favourite;
import com.example.backend.model.entity.FavouriteIdClass;
import com.example.backend.model.entity.UserEntity;

public interface FavouriteJpaRepository extends JpaRepository<Favourite, FavouriteIdClass> {
    List<Favourite> findByUser(UserEntity user);

    Optional<List<Favourite>> findByMessageId(Long messageId);

}
