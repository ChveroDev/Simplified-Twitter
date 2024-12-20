package com.example.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.model.entity.Message;
import com.example.backend.model.entity.UserEntity;

@Repository
public interface MessageJpaRepository extends JpaRepository<Message, Long> {
    List<Message> findByUser(UserEntity user);
}
